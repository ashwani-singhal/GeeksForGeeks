package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerOf2{

    private String power1(long n){
        long num = 1;
        int count = 0;

        while(num <= n){
            if((num&n) != 0){
                count++;
            }
            if(count > 1){
                break;
            }
            num = num << 1;
        }

        if(count == 1){
            return "YES";

        }
        else{
            return "NO";
        }

    }

    private static String power2(long n){

        if(n == 0){
            return "NO";
        }
        else if((n&(n-1)) == 0){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    private static String power2Modified(long n){

        return (n!=0 && (n&(n-1)) == 0) ? "YES" : "NO";
    }


    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        PowerOf2 object = new PowerOf2();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            long n = Long.parseLong(buf.readLine());

            /*........................... FIRST APPROACH .......................................*/
            //System.out.println(object.power1(n));

            /*............................ SECOND APPROACH .......................................*/

            //System.out.println(object.power2(n));

            /*............................ SECOND APPROACH MODIFIED ...............................*/

            System.out.println(object.power2Modified(n));
        }
    }
}
