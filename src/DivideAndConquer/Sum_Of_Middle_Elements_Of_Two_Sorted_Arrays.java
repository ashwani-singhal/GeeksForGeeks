package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_Of_Middle_Elements_Of_Two_Sorted_Arrays {

    private int FindMiddleSum(int[] ar1, int[] ar2, int n){
        int count = 1;
        int index1 = 0, index2 = 0;
        while (count < n){
            if(ar1[index1] <= ar2[index2]){
                index1++;
            }
            else {
                index2++;
            }
            count++;
        }
        int ans;
        if(ar1[index1] <= ar2[index2] && ar1[index1+1] <= ar2[index2]){
            ans = ar1[index1]+ar1[index1+1];
        }
        else if(ar2[index2] <= ar1[index1] && ar2[index2+1] <= ar1[index1]){
            ans = ar2[index2]+ar2[index2+1];
        }
        else{
            ans = ar1[index1]+ar2[index2];
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Sum_Of_Middle_Elements_Of_Two_Sorted_Arrays obj = new Sum_Of_Middle_Elements_Of_Two_Sorted_Arrays();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str1 = buf.readLine().split(" ");
            String[] str2 = buf.readLine().split(" ");
            int[] ar1 = new int[n];
            int[] ar2 = new int[n];
            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(str1[i]);
                ar2[i] = Integer.parseInt(str2[i]);
            }
            System.out.println(obj.FindMiddleSum(ar1,ar2,n));
        }
    }
}
