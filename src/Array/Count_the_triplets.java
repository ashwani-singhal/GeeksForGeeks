package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Count_the_triplets
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int it=0;it<t;it++)
        {
            int n = scan.nextInt();
            int[] ar = new int[n];
            //HashSet<Integer> h = new HashSet<Integer>();
            for (int j=0;j<n;j++)
            {
                ar[j] = scan.nextInt();
                //h.add(ar[j]);
            }

            Arrays.sort(ar);
            int count = 0;
	        /*for(int j=0;j<n-1;j++)
	        {
	            for(int k=j+1;k<n;k++)
	            {
	                if(h.contains(ar[j]+ar[k]))
	                    count++;
	            }
	        }*/

            for(int i=n-1;i>=0;i--)
            {
                int j = 0, k = i-1;
                while(j < k)
                {
                    if(ar[j]+ar[k] == ar[i])
                    {
                        count++;
                        j++;
                        k--;
                    }

                    else if(ar[j]+ar[k] < ar[i])
                        j++;

                    else
                        k--;
                }
            }

            if(count != 0)
                System.out.println(count);
            else
                System.out.println(-1);
        }
    }
}
