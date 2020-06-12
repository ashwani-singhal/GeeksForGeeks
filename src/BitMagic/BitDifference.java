package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BitDifference{

    private int flipBits1(int a, int b){
        int num = 1;
        int count = 0;

        while(num <= a || num <= b){
            if((a&num) != (b&num)){
                count++;
            }
            num = num << 1;
        }

        return count;
    }

    private int flipBits2(int a, int b){
        int num = a^b;
        int count = 0;

        while(num != 0){
            count++;
            num &= (num-1);
        }

        return count;
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BitDifference object = new BitDifference();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            String[] str = buf.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            /*............................... FIRST APPROACH .......................................*/
            //System.out.println(object.flipBits1(a,b));

            /*................................ SECOND APPROACH ......................................*/
            System.out.println(object.flipBits2(a,b));

        }
    }
}
