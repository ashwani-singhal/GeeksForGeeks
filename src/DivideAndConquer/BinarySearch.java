package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {

    private int FindIndex(int[] ar, int low, int high, int toBeFind){
        if (low > high){
            return -1;
        }

        int mid = low + (high-low)/2;
        if (ar[mid] == toBeFind){
            return mid;
        }
        else if(toBeFind < ar[mid]){
            return FindIndex(ar,low,mid-1,toBeFind);
        }
        else{
            return FindIndex(ar,mid+1,high,toBeFind);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BinarySearch obj = new BinarySearch();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            int toBeFind = Integer.parseInt(buf.readLine());
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(str[i]);
            }
            System.out.println(obj.FindIndex(ar,0,n-1,toBeFind));
        }
    }
}
