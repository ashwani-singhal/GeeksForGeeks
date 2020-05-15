package Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Number_Of_Paths {
    static int count = 0;

    private void NOP(int x,int y,int n,int m){
        if(x == n-1 && y == m-1)
            count += 1;

        if(x>=0 && x<n && y>=0 && y< m){
            NOP(x,y+1,n,m);
            NOP(x+1,y,n,m);
        }
    }

    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0) {
            String[] str = buf.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            Number_Of_Paths obj = new Number_Of_Paths();
            obj.NOP(0,0,n,m);
            System.out.println(count);
            count = 0;
        }
    }
}
