// FIND THE ELEMENT THAT IS PRESENT ONCE IN THE SORTED ARRAY

package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Element_Once_Using_XOR {

    private long UniqueElement(long[] ar, int n){
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= ar[i];
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Element_Once_Using_XOR obj = new Element_Once_Using_XOR();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            long[] ar = new long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Long.parseLong(str[i]);
            }
            System.out.println(obj.UniqueElement(ar,n));
        }
    }
}
