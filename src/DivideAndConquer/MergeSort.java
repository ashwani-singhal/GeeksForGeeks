package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {

    private void Print(int[] ar){
        for (Integer ele: ar) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private void Sort(int[] ar,int low, int high){
        if(low >= high){
            return;
        }

        int mid = low + (high-low)/2;
        Sort(ar,low,mid);
        Sort(ar,mid+1,high);
        Merge(ar,low,mid,high);
    }

    private void Merge(int[] ar,int low, int mid, int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] ar1 = new int[n1];
        int[] ar2 = new int[n2];

        for (int i = low; i <= mid ; i++) {
            ar1[i-low] = ar[i];
        }

        for (int i = mid+1; i <= high ; i++) {
            ar2[i-mid-1] = ar[i];
        }

        int i=0, j=0 , k = low;

        while (i < n1 && j < n2){
            if(ar1[i] <= ar2[j]){
                ar[k] = ar1[i];
                i++;
            }
            else{
                ar[k] = ar2[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            ar[k] = ar1[i];
            i++;
            k++;
        }

        while (j < n2){
            ar[k] = ar2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        MergeSort obj = new MergeSort();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(str[i]);
            }
            obj.Sort(ar,0,n-1);
            obj.Print(ar);
        }
    }
}
