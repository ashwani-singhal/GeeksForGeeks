package Array;

import java.util.Scanner;

public class Subarry_with_given_sum
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = scan.nextInt();
            long sum = scan.nextLong();
            long[] ar = new long[n];

            for(int j=0;j<n;j++)
                ar[j] = scan.nextLong();

            long ans = ar[0];
            int s = 0, e = 0;

            int index = 1;
            while(index < n)
            {
                if(ans == sum)
                    break;

                else if(ans > sum)
                {
                    ans -= ar[s];
                    s++;
                }

                else
                {
                    ans += ar[index];
                    e = index;
                    index++;
                }
                //System.out.println(ans);
                //System.out.println((s+1)+" "+(e+1));
            }

            while(ans > sum)
            {
                ans -= ar[s];
                s++;
            }
            if(ans == sum)
                System.out.println((s+1)+" "+(e+1));
            else
                System.out.println(-1);
        }
    }
}