package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateBits{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            String[] str = buf.readLine().split(" ");
            short n = Short.parseShort(str[0]);
            //int n = Integer.parseInt(str[0]);
            //long n = Long.parseLong(str[0]);
            int shift = Integer.parseInt(str[1]);


        }
    }
}
