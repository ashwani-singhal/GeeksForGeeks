package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Special_Keyword_DP {

    private int Special_Number(int n){

        if (n <= 6)
            return n;

        int ar[] = new int[n+1];

        for (int i = 1; i <= 6; i++) {
            ar[i] = i;
        }

        for (int i = 7; i <=n ; i++) {

            for (int j = i-3; j >=1 ; j--) {

                int present = (i-j-1)*ar[j];
                if(present > ar[i]){
                    ar[i] = present;
                }
            }
        }

        return ar[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Special_Keyword_DP obj = new Special_Keyword_DP();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            if (n > 75) {
                System.out.println(-1);
            }
            else {
                System.out.println(obj.Special_Number(n));
            }
        }
    }
}
