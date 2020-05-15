package Recursion;

import java.io.*;

class Flood_Fill_Algorithm
{
    private void print(int[][] ar,int n,int m) throws IOException {
        OutputStream out = new BufferedOutputStream(System.out);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.write((ar[i][j]+" ").getBytes());
            }
        }
        out.flush();
    }

    /*private boolean isSafe(int[][] ar,int n,int m,int x,int y,int toChange){
        return (x >= 0 && x < n) && (y >= 0 && y < m) && ar[x][y] == toChange;
    }*/

    private void FFA(int[][] ar,int n,int m,int x,int y,int toChange, int withChange){

        if(x < 0 || x >= n || y < 0 || y >= m || ar[x][y] != toChange)
            return;

        ar[x][y] = withChange;
        FFA(ar,n,m,x-1,y,toChange,withChange);
        FFA(ar,n,m,x+1,y,toChange,withChange);
        FFA(ar,n,m,x,y-1,toChange,withChange);
        FFA(ar,n,m,x,y+1,toChange,withChange);

        /*if(isSafe(ar,n,m,x-1,y,toChange)){
            FFA(ar,n,m,x-1,y,toChange,withChange);
        }
        if(isSafe(ar,n,m,x+1,y,toChange)){
            FFA(ar,n,m,x+1,y,toChange,withChange);
        }
        if(isSafe(ar,n,m,x,y-1,toChange)){
            FFA(ar,n,m,x,y-1,toChange,withChange);
        }
        if(isSafe(ar,n,m,x,y+1,toChange)){
            FFA(ar,n,m,x,y+1,toChange,withChange);
        }*/
    }


    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0){
            String[] str = buf.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);

            String[] str2 = buf.readLine().split(" ");
            int[][] ar = new int[n][m];

            int r = 0, c = 0;
            for(int i=0;i<n*m;i++){
                if(c == m){
                    r++;
                    c = 0;
                }
                ar[r][c] = Integer.parseInt(str2[i]);
                c++;
            }

            String[] str3 = buf.readLine().split(" ");
            int x = Integer.parseInt(str3[0]);
            int y = Integer.parseInt(str3[1]);
            int withChange = Integer.parseInt(str3[2]);
            int toChange = ar[x][y];

            Flood_Fill_Algorithm obj = new Flood_Fill_Algorithm();
            obj.FFA(ar,n,m,x,y,toChange,withChange);
            obj.print(ar,n,m);
            System.out.println();
        }
    }
}