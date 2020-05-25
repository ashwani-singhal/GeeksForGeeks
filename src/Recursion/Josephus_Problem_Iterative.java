package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Josephus_Problem_Iterative {

    private int SafePlace(int n, int k){
        int ans = 0;

        for (int i = 2; i <=n ; i++) {
            ans = (ans + k) % i;
        }
        return ans + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Josephus_Problem_Iterative obj = new Josephus_Problem_Iterative();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            String[] str = buf.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            System.out.println(obj.SafePlace(n,k));
        }
    }
}
