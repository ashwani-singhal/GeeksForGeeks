package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_Of_Pairs
{
    public static int count(int x, int[] ar2, int n, int[] not_y)
    {
        if(x == 0)  return 0;

        if(x == 1)  return not_y[0];

        int idx = Arrays.binarySearch(ar2,x);
        int ans;

        if(idx < 0)
        {
            idx = Math.abs(idx+1);
        }
        else
        {
            while(idx<n && ar2[idx] == x)
                idx++;

        }
        ans = ar2.length - idx;

        ans += (not_y[0] + not_y[1]);

        if(x == 2)  ans -= (not_y[3]+not_y[4]);

        if(x == 3)  ans += not_y[2];

        return ans;

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0)
        {
            String[] str = buf.readLine().split(" ");
            int m = Integer.parseInt(str[0]);
            int n = Integer.parseInt(str[1]);

            String[] str1 = buf.readLine().split(" ");
            int[] ar1 = new int[m];
            for(int i=0;i<m;i++)
            {
                ar1[i] = Integer.parseInt(str1[i]);
            }

            String[] str2 = buf.readLine().split(" ");
            int[] ar2 = new int[n];
            for(int i=0;i<n;i++)
            {
                ar2[i] = Integer.parseInt(str2[i]);
            }

            Arrays.sort(ar2);

            int[] not_y = new int[5];
            for(int i=0;i<n;i++)
            {
                if(ar2[i] < 5)
                {
                    not_y[ar2[i]]++;
                }
                else
                {
                    break;
                }
            }

            long total_pairs = 0;
            for(int i=0;i<m;i++)
            {
                total_pairs += count(ar1[i],ar2,n,not_y);
            }

            System.out.println(total_pairs);
        }
    }
}
