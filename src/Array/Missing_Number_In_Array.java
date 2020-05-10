package Array;

import java.lang.*;
import java.util.Scanner;

public class Missing_Number_In_Array
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int itr = 0; itr < t ; itr++)
        {
            int n = scan.nextInt();
            int ans = 1;

            if(n != 1)
            {
                int a = 1;
                int b = 0;
                for(int i=2;i<=n;i++)
                {
                    a ^= i;
                    b ^= scan.nextInt();
                }
                ans = a^b;
            }
            System.out.println(ans);
        }

    }
}
