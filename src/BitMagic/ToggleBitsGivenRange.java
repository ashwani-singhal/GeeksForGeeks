package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggleBitsGivenRange{

    private long toggle1(int n, int left, int right){
        int m = 1;
        int position = 1;

        int ans = 0;
        while(position <= right){
            if(position >= left){
                if((n&m) == 0){
                    ans += Math.pow(2,position-1);
                    //System.out.println("0 "+ans);
                    //System.out.println("n m "+n+" "+m);
                }
                else{
                    ans -= Math.pow(2,position-1);
                }
            }

            //System.out.println(ans);
            m = m << 1;
            position++;
        }

        return (n+ans);
    }


    private long toggle2(int n,int left,int right){
        long num = ((1 << right) - 1)^((1 << (left-1))-1);
        return (num^n);
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ToggleBitsGivenRange object = new ToggleBitsGivenRange();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            String[] str = buf.readLine().split(" ");

            int n = Integer.parseInt(str[0]);
            int l = Integer.parseInt(str[1]);
            int r = Integer.parseInt(str[2]);

            /*.........................  BASIC APPROACH ..........................................*/

            //System.out.println(object.toggle1(n,l,r));

            /*.......................... BIT MANIPULATION APPROACH ................................*/

            System.out.println(object.toggle2(n,l,r));
        }
    }
}
