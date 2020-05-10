package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Kadanes_Algorithm
{
    public static void main (String[] args) throws IOException,NumberFormatException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());

        while(t-- != 0)
        {
            int n = Integer.parseInt(buf.readLine());

            String[] str = buf.readLine().split(" ");
            int[] ar = new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i] = Integer.parseInt(str[i]);
            }

            int max_so_far = ar[0], max_till_here = ar[0];

            for(int i=1; i<n; i++)
            {
                max_till_here = Math.max(ar[i],max_till_here+ar[i]);
                max_so_far = Math.max(max_so_far,max_till_here);
            }

            System.out.println(max_so_far);

        }

    }
}
