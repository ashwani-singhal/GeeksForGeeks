package String;

import java.util.Scanner;

public class Reverse_Words_Of_Given_String
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int itr = 0; itr < t ; itr++)
        {
            String temp = scan.next();
            String[] str = temp.split("\\.");
            StringBuilder ans = new StringBuilder();

            for(int i = str.length-1;i>0;i--)
            {
                ans.append(str[i]).append(".");
            }

            if(temp.charAt(temp.length()-1) != '.')
            {
                ans.append(str[0]);
            }
            else
            {
                ans.append(str[0]).append(".");
            }

            System.out.println(ans);
        }

    }
}
