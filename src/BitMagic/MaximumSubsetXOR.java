package BitMagic;

import java.util.*;

public class MaximumSubsetXOR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[10004];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(XOR.maxSubarrayXOR(a , n));
        }
    }
}// } Driver Code Ends


/*Complete the function below*/
class XOR
{
    public static int maxSubarrayXOR(int[] set, int n)
    {
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            int sum = 0;

            for(int j=0;j<n;j++){

                sum = sum^set[(i+j)%n];
                ans = Math.max(ans,sum);
            }
        }

        return ans;
    }
}
