package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Special_Keyword_Recursion {

    private int Special_Number(int n){
        if(n<=6)
            return n;

        int max = 0;
        for (int i = n-3; i >=1 ; i--) {
            int present = (n-i-1) * Special_Number(i);
            if(present > max)
                max = present;
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Special_Keyword_Recursion obj = new Special_Keyword_Recursion();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            if(n > 75){
                System.out.println(-1);
            }
            else{
                System.out.println(obj.Special_Number(n));
            }
        }
    }
}
