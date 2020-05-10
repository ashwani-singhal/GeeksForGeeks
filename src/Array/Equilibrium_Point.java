package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Equilibrium_Point
{
    private static int Point(int[] ar, int n, long sum){
        int ans = -1;
        if(n == 1){
            ans = 1;
        }
        else{
            long temp = 0;
            for (int i = 1; i < n; i++) {
                temp += ar[i-1];
                sum -= ar[i-1];

                if (temp == sum){
                    ans = i+1;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0) {
            int n = Integer.parseInt(buf.readLine());

            String[] str = buf.readLine().split(" ");
            int[] ar = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(str[i]);
                sum += ar[i];
            }
            System.out.println(Point(ar,n,sum));
        }
    }
}

