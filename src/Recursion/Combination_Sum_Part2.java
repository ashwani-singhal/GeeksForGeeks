package Recursion;

import java.io.*;
import java.util.*;

public class Combination_Sum_Part2 {

    private void print(LinkedHashSet<String> set) throws IOException {
        if(set.isEmpty()){
            System.out.println("Empty");
            return;
        }

        OutputStream out = new BufferedOutputStream(System.out);

        for (String str: set) {
            if(str.length() == 1){
                out.write(("("+str+")").getBytes());
            }
            else if (str.length() == 2){
                out.write(("("+str.charAt(0)+" "+str.charAt(1)+")").getBytes());
            }
            else{
                int n = str.length();
                for (int i = 0; i < n; i++) {
                    if (i == 0){
                        out.write(("("+str.charAt(i)+" ").getBytes());
                    }
                    else if (i == n-1){
                        out.write((str.charAt(i)+")").getBytes());
                    }
                    else {
                       out.write((str.charAt(i)+" ").getBytes());
                    }
                }
            }
        }
        out.flush();
        System.out.println();
    }

    private void CombSum(int index, int current_sum, int totalSum, StringBuilder currList, int[] ar,LinkedHashSet<String> set) {
        if(current_sum == totalSum){
            String str = currList.toString();
            if(!set.contains(str))
                set.add(str);
            return;
        }

        for (int i = index; i < ar.length; i++) {
            if(current_sum + ar[i] > totalSum)
                continue;

            if(i == 1 && ar[i] == ar[i-1] && i > index)
                continue;

            currList.append(ar[i]);

            CombSum(i+1,current_sum+ar[i],totalSum,currList,ar,set);

            currList.setLength(currList.length()-1);
        }
    }

    private void Comb(int[] ar, int totalSum,LinkedHashSet<String> set) throws IOException {
        Arrays.sort(ar);
        CombSum(0,0,totalSum, new StringBuilder(),ar, set);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0){
            int n = Integer.parseInt(buf.readLine());
            String[] str = buf.readLine().split(" ");
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(str[i]);
            }
            int totalSum = Integer.parseInt(buf.readLine());

            Combination_Sum_Part2 obj = new Combination_Sum_Part2();
            LinkedHashSet<String> set = new LinkedHashSet<>();
            obj.Comb(ar, totalSum,set);
            //System.out.println(set);
            obj.print(set);
        }
    }
}

