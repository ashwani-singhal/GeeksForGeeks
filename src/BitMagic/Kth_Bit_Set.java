package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kth_Bit_Set{

    private String isBitset(int n, int k){
        int temp = (1 << k);
        //System.out.println(n&temp);

        if((n&temp) == temp){
            return "Yes";
        }
        else{
            return "No";
        }
    }


    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Kth_Bit_Set object = new Kth_Bit_Set();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            int k = Integer.parseInt(buf.readLine());

            System.out.println(object.isBitset(n,k));
        }
    }
}
