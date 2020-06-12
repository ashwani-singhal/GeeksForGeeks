package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberIsSparseOrNot{

    private int checkSparse1(int n){
        int count = 0;

        while(n != 0){
            n = (n & (n<<1));
            count++;

            if(count > 1){
                break;
            }
        }

        return (count == 1) ? 1 : 0;
    }

    private int checkSparse2(int n){

        if((n & (n >> 1)) >= 1){
            return 0;
        }
        return 1;
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        NumberIsSparseOrNot object = new NumberIsSparseOrNot();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            int n = Integer.parseInt(buf.readLine());

            /*............................... FIRST APPROACH .......................................*/
            //System.out.println(object.checkSparse1(n));

            /*................................ SECOND APPROACH ......................................*/
            System.out.println(object.checkSparse2(n));
        }
    }
}
