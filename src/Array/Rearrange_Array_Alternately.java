package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rearrange_Array_Alternately
{
    private static void rearrange(long[] ar, int n)
    {
        long max = ar[n-1]+1;
        int s = 0, e = n-1;

        for(int i=0;i<n;i++)
        {
            if(i%2 == 0)
            {
                ar[i] += (ar[e]%max)*max;
                e--;
            }
            else
            {
                ar[i] += (ar[s]%max)*max;
                s++;
            }
        }

        for(int i=0;i<n;i++)
        {
            ar[i] /= max;
        }
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
                ar[i] = Integer.parseInt(str[i]);

            rearrange(ar,n);

            for(int i=0;i<n;i++)
            {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }
}
