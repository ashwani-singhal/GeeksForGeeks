package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumOperationsDP {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());

        int[] ans = new int[10001];

        // F(n) = min(1+F(n-1),1+F(n/2)+n%2)

        for (int i = 1; i < 10001; i++) {
            ans[i] = Math.min(1+ans[i-1],1+ans[i/2]+i%2);
        }

        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            System.out.println(ans[n]);
        }
    }
}
