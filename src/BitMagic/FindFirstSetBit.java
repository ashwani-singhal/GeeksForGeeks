package BitMagic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class FindFirstSetBit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0)
        {
            int n = Integer.parseInt(buf.readLine());

            // FIRST WAY TO DO

            /*String str = Integer.toBinaryString(n);
            int ans = 0;
            boolean flg = false;
            for(int i=str.length()-1;i>=0;i--){
                if(str.charAt(i) =='1'){
                    ans = i;
                    flg = true;
                    break;
                }
            }
            if(flg){
                System.out.println(str.length()-ans);
            }
            else{
                System.out.println(0);
            }*/

            //SECOND WAY TO DO

            /*if(n == 0)
                System.out.println(0);
            else
            {
                int position = 1;
                int m = 1;
                while((n&m) == 0){
                    m = m << 1;
                    position++;
                }
                System.out.println(position);
            }*/

            // THIRD WAY TO DO

            if(n == 0)
                System.out.println(0);
            else
                System.out.println((int)(Math.log10(n & -n)/Math.log10(2))+1);

        }
    }
}
