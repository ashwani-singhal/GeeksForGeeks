package Array;

import java.io.*;
import java.util.ArrayList;

public class Leaders_In_An_Array {
    private static void Leader(int[] ar, int n) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int prev = ar[n-1];
        list.add(ar[n-1]);

        for (int i = n-2; i >= 0 ; i--) {
            if (ar[i] >= prev){
                list.add(ar[i]);
                prev = ar[i];
            }
        }

        OutputStream out  = new BufferedOutputStream(System.out);
        for (int i = list.size()-1; i >=0 ; i--) {
            out.write((list.get(i)+" ").getBytes());
        }
        out.flush();
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t =  Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(str[i]);
            }
            Leader(ar,n);
        }
    }
}
