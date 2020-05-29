// TIME COMPLEXITY OF THIS APPROACH IS O(log(k)) USING DIVIDE AND CONQUER APPROACH.

package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kth_Element_Of_Two_Sorted_Arrays_DivideAndConquer1 {

    private int Kth(int[] ar1, int[] ar2, int n, int m, int k, int st1, int st2){
        if (st1 == n){
            return ar2[st2+k-1];
        }

        if (st2 == m){
            return ar1[st1+k-1];
        }

        if (k==0 || k > (n-st1)+(m-st2)){
            return -1;
        }

        if(k==1){
            return Math.max(ar1[st1], ar2[st2]);
        }

        int curr = k/2;

        if (curr-1 >= n-st1){
            if (ar1[n-1] < ar2[st2+curr-1]){
                return ar2[st2 + (k - (n - st1) - 1)];
            }
            else {
                return Kth(ar1,ar2,n,m,k-curr,st1,st2+curr);
            }
        }

        if (curr-1 >= m-st2){
            if (ar2[n-1] < ar1[st1+curr-1]){
                return ar1[st1 + (k - (m - st2) - 1)];
            }
            else {
                return Kth(ar1,ar2,n,m,k-curr,st1+curr,st2);
            }
        }

        else {
            if (ar1[curr + st1 - 1] < ar2[curr + st2 - 1]){
                return Kth(ar1,ar2,n,m,k-curr,st1+curr,st2);
            }
            else{
                return Kth(ar1,ar2,n,m,k-curr,st1,st2+curr);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Kth_Element_Of_Two_Sorted_Arrays_DivideAndConquer1 obj = new Kth_Element_Of_Two_Sorted_Arrays_DivideAndConquer1();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            String[] str = buf.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int k = Integer.parseInt(str[2]);

            String[] str1 = buf.readLine().split(" ");
            String[] str2 = buf.readLine().split(" ");
            int[] ar1 = new int[n];
            int[] ar2 = new int[m];

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(str1[i]);
            }

            for (int i = 0; i < m; i++) {
                ar2[i] = Integer.parseInt(str2[i]);
            }

            System.out.println(obj.Kth(ar1,ar2,n,m,k-1,0,0));
        }
    }
}
