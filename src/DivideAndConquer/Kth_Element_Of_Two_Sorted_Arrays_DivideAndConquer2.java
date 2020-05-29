// TIME COMPLEXITY OF THIS APPROACH IS O(log(k)) USING DIVIDE AND CONQUER APPROACH.

package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Kth_Element_Of_Two_Sorted_Arrays_DivideAndConquer2 {

    private int kth(int[] arr1, int m, int[] arr2, int n, int k) {
        if (k > (m + n) || k < 1)
            return -1;

        if (m > n)
            return kth(arr2, n, arr1, m, k);

        if (m == 0)
            return arr2[k - 1];

        if (k == 1)
            return Math.min(arr1[0], arr2[0]);

        int i = Math.min(m, k / 2);
        int j = Math.min(n, k / 2);

        if (arr1[i - 1] > arr2[j - 1])
        {
            int[] temp = Arrays.copyOfRange(arr2, j, n);
            return kth(arr1, m, temp, n - j, k - j);
        }

        int[] temp = Arrays.copyOfRange(arr1, i, m);
        return kth(temp, m - i, arr2, n, k - i);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Kth_Element_Of_Two_Sorted_Arrays_DivideAndConquer2 obj = new Kth_Element_Of_Two_Sorted_Arrays_DivideAndConquer2();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0) {
            String[] str = buf.readLine().split(" ");
            int m = Integer.parseInt(str[0]);
            int n = Integer.parseInt(str[1]);
            int k = Integer.parseInt(str[2]);

            String[] str1 = buf.readLine().split(" ");
            String[] str2 = buf.readLine().split(" ");

            int[] ar1 = new int[m];
            int[] ar2 = new int[n];

            for (int i = 0; i < m; i++) {
                ar1[i] = Integer.parseInt(str1[i]);
            }

            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(str2[i]);
            }

            int ans = obj.kth(ar1, m, ar2, n, k);
            if (ans == -1)
                System.out.println("Invalid query");
            else
                System.out.println(ans);
        }
    }
}
