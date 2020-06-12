package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxLengthChain {

    private void pairSort(int[] ar, int len){
        int min_index = 1;
        for (int i = 1; i < len; i+=2) {
            if(ar[i] < ar[min_index]){
                min_index = i;
            }
        }

        int temp = ar[min_index-1];
        ar[min_index-1] = ar[0];
        ar[0] = temp;

        temp = ar[min_index];
        ar[min_index] = ar[1];
        ar[1] = temp;

        for (int i = 1; i < len; i+=2) {
            min_index = i+1;
            for (int j = i+1; j < len; j+=2) {
                if (ar[j] > ar[i] && ar[j] < ar[min_index]){
                    min_index = j;
                }
            }

            temp = ar[min_index];
            ar[min_index] = ar[i+1];
            ar[i+1] = temp;

            temp = ar[min_index+1];
            ar[min_index+1] = ar[i+2];
            ar[i+2] = temp;
        }
    }

    private int maxPairs(int[] ar, int len){
        int count = 0;
        for (int i = 1; i < len; i+=2) {
            int temp = 0;
            for (int j = i; j < len-1; j+=2) {
                if (ar[j+1] > ar[j]){
                    temp++;
                }
            }

            if (temp > count){
                count = temp;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        MaxLengthChain obj = new MaxLengthChain();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            int[] ar = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                ar[i] = Integer.parseInt(str[i]);
            }
            obj.pairSort(ar,2*n);
            System.out.println(obj.maxPairs(ar,2*n));
        }
    }
}
