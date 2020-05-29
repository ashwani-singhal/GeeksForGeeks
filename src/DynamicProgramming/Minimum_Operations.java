// THIS IS THE FIRST SOLUTION USING WHILE LOOP

// TIME COMPLEXITY FOR EACH TEST CASE IS GREATER THAN AND EQUAL TO O(log(N)) AND LESS THAN O(N)

package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimum_Operations {

    private int stepsToN(int N){
        int count = 0;
        while (N != 0) {
            if ((N & 1) != 0) {   // to check if N Is odd number
                N--;
            } else {
                N = N >> 1;  // to divide number by 2
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Minimum_Operations obj = new Minimum_Operations();
        int t = Integer.parseInt(buf.readLine());
        while (t-- != 0) {
            int n = Integer.parseInt(buf.readLine());
            System.out.println(obj.stepsToN(n));
        }
    }
}
