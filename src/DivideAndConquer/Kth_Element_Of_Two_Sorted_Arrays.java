// This algorithm has a linear time complexity of O(k)

package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kth_Element_Of_Two_Sorted_Arrays
{
    private int KthElement(int[] ar1, int[] ar2, int n, int m, int k){
        int count = 1;
        int i=0, j=0;
        while (count < k && i < n && j < m){
            if (ar1[i] <= ar2[j]){
                i++;
            }
            else{
                j++;
            }
            count++;
        }

        while (count < k && i < n){
            i++;
            count++;
        }

        while (count < k && j < m){
            j++;
            count++;
        }

        if (i<n && j<m && ar1[i] <= ar2[j]){
            return ar1[i];

        }
        else if (i<n && j<m && ar1[i] > ar2[j]){
            return ar2[j];
        }
        else{
            if(j < m){
                return ar2[j];
            }
            else{
                return ar1[i];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Kth_Element_Of_Two_Sorted_Arrays obj = new Kth_Element_Of_Two_Sorted_Arrays();
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

            System.out.println(obj.KthElement(ar1,ar2,n,m,k));
        }
    }
}
