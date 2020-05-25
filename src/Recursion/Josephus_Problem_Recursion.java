package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Josephus_Problem_Recursion {

    private int SafePlace(int n,int k){
        if(n == 1){
            return 1;
        }

        return ((SafePlace(n-1,k) + k-1) % n) + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Josephus_Problem_Recursion obj = new Josephus_Problem_Recursion();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            String[] str = buf.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            System.out.println(obj.SafePlace(n,k));
        }
    }
}
