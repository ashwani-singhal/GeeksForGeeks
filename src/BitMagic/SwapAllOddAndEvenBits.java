package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwapAllOddAndEvenBits{

    private int swap1(int n){
        int a = 1;
        int b = 2;

        while(a<=n || b<=n){
            if(((a&n) != 0 && (b&n) == 0) || ((a&n) == 0 && (b&n) != 0)){
                n = n^a;
                n = n^b;
            }
            a = a<<2;
            b = b<<2;
        }

        return n;
    }

    private int swap2(int n){

        int even_bit = n & 0xAAAAAAAA;
        int odd_bit = n & 0x55555555;

        even_bit = even_bit >> 1;
        odd_bit = odd_bit << 1;

        return (even_bit | odd_bit);
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        SwapAllOddAndEvenBits object = new SwapAllOddAndEvenBits();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            int n = Integer.parseInt(buf.readLine());

            /*........................... FIRST APPROACH .......................................*/
            //System.out.println(object.swap1(n));

            /*............................ SECOND APPROACH .......................................*/
            System.out.println(object.swap2(n));
        }
    }
}
