package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Element_Once_BinarySearch {

    private void UniqueElement(long[] ar, int low, int high){
        if (low > high)
            return;

        if (low == high) {
            System.out.println(ar[low]);
            return;
        }

        int mid = (low + high)/2;

        if ((mid&1) != 1){

            if (ar[mid] == ar[mid+1])
                UniqueElement(ar,mid+2,high);

            else
                UniqueElement(ar,low,mid);
        }

        else {

            if (ar[mid] == ar[mid-1])
                UniqueElement(ar,mid+1,high);

            else
                UniqueElement(ar,low,mid-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Element_Once_BinarySearch obj = new Element_Once_BinarySearch();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            long[] ar = new long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Long.parseLong(str[i]);
            }

            obj.UniqueElement(ar,0,n-1);
        }
    }
}
