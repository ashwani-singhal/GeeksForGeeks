package BitMagic;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongestConsecutive_1s{

    private int consecutiveOne1(int n){
        int ans = 0;
        int count = 0;

        while(n >= 1){
            if((n&1) != 0){
                count++;
            }
            else{
                if(count > ans){
                    ans = count;
                }
                count = 0;
            }
            n = n>>1;
        }

        if(count > ans){
            ans = count;
        }

        return ans;
    }

    /*................... COMPLEXITY WILL BE EQUAL TO MAX. CONSECUTIVE SEQUENCE OF 1 ..............*/
    private int consecutiveOne2(int n)
    {
        int count = 0;
        while(n != 0){
            n = (n & (n<<1));
            count++;
        }
        return count;
    }

    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        LongestConsecutive_1s object = new LongestConsecutive_1s();
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            int n = Integer.parseInt(buf.readLine());

            /*............................... FIRST APPROACH .......................................*/
            //System.out.println(object.consecutiveOne1(n));

            /*................................ SECOND APPROACH ......................................*/
            System.out.println(object.consecutiveOne2(n));
        }
    }
}
