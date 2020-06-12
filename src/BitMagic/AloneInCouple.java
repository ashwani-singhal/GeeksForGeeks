package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AloneInCouple{

    private int Alone(int[] ar){
        int ans = 0;

        for(Integer ele: ar){
            ans ^= ele;
        }

        return ans;
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        AloneInCouple object = new AloneInCouple();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            int[] ar = new int[n];

            for(int i=0;i<n;i++){
                ar[i] = Integer.parseInt(str[i]);
            }

            System.out.println(object.Alone(ar));
        }
    }
}
