package Array;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

//  we r given two sorted arrys to merge


public class Merge_Without_Extra_Space
{
    private static int nextGap(int gap)
    {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    private static void merge(int[] arr1, int[] arr2,
                              int n, int m) {
        int i, j, gap = n + m;
        for (gap = nextGap(gap); gap > 0;
             gap = nextGap(gap))
        {
            // comparing elements in the first
            // array.
            for (i = 0; i + gap < n; i++)
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i+gap] = temp;
                }

            // comparing elements in both arrays.
            for (j = gap > n ? gap - n : 0 ;
                 i < n && j < m; i++, j++)
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }

            if (j < m)
            {
                // comparing elements in the
                // second array.
                for (j = 0; j + gap < m; j++)
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j+gap] = temp;
                    }
            }
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buf.readLine());
        while(t-- != 0)
        {
            String[] str = buf.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);

            String[] str1 = buf.readLine().split(" ");
            int[] ar1 = new int[n];
            for(int i=0;i<n;i++)
                ar1[i] = Integer.parseInt(str1[i]);

            String[] str2 = buf.readLine().split(" ");
            int[] ar2 = new int[m];
            for(int i=0;i<m;i++)
                ar2[i] = Integer.parseInt(str2[i]);

            merge(ar1,ar2,n,m);


	        /*StringBuilder sb = new StringBuilder();
	        for(int i=0;i<n;i++)
	            sb.append(ar1[i]+" ");

	        for(int i=0;i<m;i++)
	            sb.append(ar2[i]+" ");

	        System.out.print(sb.toString());*/



            OutputStream out = new BufferedOutputStream(System.out);
            for(int i=0;i<n;i++)
                out.write((ar1[i]+" ").getBytes());

            for(int i=0;i<m;i++)
                out.write((ar2[i]+" ").getBytes());
            out.flush();



	        /*BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
	        for(int i=0;i<n;i++)
	            log.write(ar1[i]+" ");

            for(int i=0;i<m;i++)
                log.write(ar2[i]+" ");
            log.flush();*/


            System.out.println();
        }
    }
}
