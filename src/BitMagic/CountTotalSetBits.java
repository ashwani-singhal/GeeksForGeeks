package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountTotalSetBits{

    private int countSetBits(int n){
        int count = 0;

        for(int i=1;i<=n;i++){
            int temp = 1;

            while(temp <= i){
                if((temp&i) != 0){
                    count++;
                }
                temp = temp<<1;
            }
        }

        return count;
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        CountTotalSetBits object = new CountTotalSetBits();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            System.out.println(object.countSetBits(n));
        }
    }
}
