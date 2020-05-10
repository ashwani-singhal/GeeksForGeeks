package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inversion_Of_Array
{
    public static long mergeSort(long[] ar, int start, int end)
    {
        long count = 0;
        if(start < end)
        {
            int mid = start + (end-start)/2;
            count += mergeSort(ar,start,mid);
            count += mergeSort(ar,mid+1,end);
            count += merge(ar,start,mid,end);
        }

        return count;
    }

    public static long merge(long[] ar, int start, int mid, int end)
    {
        int n1 = mid-start+1;
        int n2 = end - mid;

        long[] left = new long[n1];
        long[] right = new long[n2];

        if (n1 >= 0) System.arraycopy(ar, start, left, 0, n1);

        if (n2 >= 0) System.arraycopy(ar,mid+1,right,0,n2);

        int i=0, j=0;
        long swap = 0;
        int index = start;
        while(i<n1 && j<n2)
        {
            if(left[i] <= right[j])
            {
                ar[index++] = left[i++];
            }
            else
            {
                ar[index++] = right[j++];
                swap += (mid+1)-(start+i);
            }
        }

        while(i<n1)
        {
            ar[index++] = left[i++];
        }

        while(j<n2)
        {
            ar[index++] = right[j++];
        }

        return swap;
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0)
        {
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            long[] ar = new long[n];

            for(int i=0;i<n;i++)
                ar[i] = Long.parseLong(str[i]);

            System.out.println(mergeSort(ar,0,n-1));
        }
    }
}
