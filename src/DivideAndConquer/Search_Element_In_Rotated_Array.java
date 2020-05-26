package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search_Element_In_Rotated_Array {

    private boolean onLeftSide(int[] ar,int low,int mid,int high, int toBeFind){
        if (ar[low] < ar[mid]){
            return ar[low] <= toBeFind && toBeFind <= ar[mid];
        }
        else {
            return ar[high] > ar[mid] && !(ar[mid] <= toBeFind && ar[high] >= toBeFind);
        }
    }

    private int FindIndex(int[] ar, int n, int toBeFind) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (ar[mid] == toBeFind) {
                return mid;
            }
            else if (onLeftSide(ar, low, mid, high, toBeFind)) {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Search_Element_In_Rotated_Array obj = new Search_Element_In_Rotated_Array();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            int toBeFind = Integer.parseInt(buf.readLine());
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(str[i]);
            }
            System.out.println(obj.FindIndex(ar,n,toBeFind));
        }
    }
}
