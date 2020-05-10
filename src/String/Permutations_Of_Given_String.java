package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Permutations_Of_Given_String
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int itr = 0; itr < t ; itr++)
        {
            String str = scan.next();
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            helper(new ArrayList<>(), new String(charArray), new boolean[str.length()]);
            System.out.println();
        }
    }


    private static void helper(List<Character> ch, String str, boolean[] visited)
    {
        if(ch.size() == str.length())
        {
            for (Character character : ch) {
                System.out.print(character);
            }
            System.out.print(" ");
        }

        for(int i=0;i<str.length();i++)
        {
            if(visited[i]) continue;
            ch.add(str.charAt(i));
            visited[i] = true;

            helper(ch,str,visited);
            ch.remove(ch.size()-1);
            visited[i] = false;
        }
    }
}