package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Special_Keyword_DP_Optimised {

    private int Specil_Number(int n){
        if(n <= 6){
            return n;
        }

        int[] ar = new int[n+1];

        for (int i = 1; i <=n ; i++) {
            ar[i] = i;
        }

        for (int i = 7; i <= n ; i++) {
            ar[i] = Math.max(2*ar[n-3],Math.max(3*ar[n-4],4*ar[n-5]));
        }

        return ar[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Special_Keyword_DP_Optimised obj = new Special_Keyword_DP_Optimised();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            if (n > 75){
                System.out.println(-1);
            }
            else{
                System.out.println(obj.Specil_Number(n));
            }
        }
    }
}
