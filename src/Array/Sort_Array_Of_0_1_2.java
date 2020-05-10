package Array;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Sort_Array_Of_0_1_2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0)
        {
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            int[] ar = new int[n];

            int zero = 0, one = 0, two = 0;
            for(int i=0;i<n;i++)
            {
                ar[i] = Integer.parseInt(str[i]);
                if(ar[i] == 0)
                {
                    zero++;
                }
                else if(ar[i] == 1)
                {
                    one++;
                }
                else
                {
                    two++;
                }
            }

            for (int i = 0; i < n ; i++)
            {
                if(zero != 0)
                {
                    ar[i] = 0;
                    zero--;
                }
                else if(one != 0)
                {
                    ar[i] = 1;
                    one--;
                }
                else
                {
                    ar[i] = 2;
                    two--;
                }
            }

            OutputStream out = new BufferedOutputStream(System.out);
            for (int i = 0; i < n ; i++) {
                out.write((ar[i]+" ").getBytes());
            }
            out.flush();
            System.out.println();
        }
    }
}
