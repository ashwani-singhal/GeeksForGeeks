package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RightmostDifferentBit{

    private int differentBit(int n, int m){
        int position = 1;
        int temp = 1;

        while((n&temp) == (m&temp)){
            temp = temp << 1;
            position++;
        }
        return position;
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        RightmostDifferentBit object = new RightmostDifferentBit();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            String[] str = buf.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);

            System.out.println(object.differentBit(n,m));
        }
    }
}
