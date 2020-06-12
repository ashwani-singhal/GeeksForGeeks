package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Set_KthBit{

    private int kthBitSet(int n, int k){
        return ((1 << k)|n);
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Set_KthBit object = new Set_KthBit();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            String[] str = buf.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);

            System.out.println(object.kthBitSet(n,k));
        }
    }
}
