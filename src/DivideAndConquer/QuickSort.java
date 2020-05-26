package DivideAndConquer;

import java.util.Scanner;

public class QuickSort {

    int[] Sorted_Array(int[] elements, int start, int end){
        if(start<end){
            int partitionIndex=partition(elements,start,end);
            Sorted_Array(elements,start,partitionIndex-1);
            Sorted_Array(elements,partitionIndex+1,end);
        }
        return elements;
    }

    int partition(int[] elements, int start, int end){
        int pivot_element=elements[end];
        int pIndex=start;
        for(int i=start;i<end;i++){
            if(elements[i]<=pivot_element){
                int temp=elements[i];
                elements[i]=elements[pIndex];
                elements[pIndex]=temp;
                pIndex++;
            }
        }
        int temp=elements[pIndex];
        elements[pIndex]=elements[end];
        elements[end]=temp;

        return pIndex;
    }

    public static void main(String[] args) {
        QuickSort object=new QuickSort();
        Scanner scan=new Scanner(System.in);
        try{
            System.out.println("enter the number of elements");
            int n=scan.nextInt();
            System.out.println("enter the "+n+" elements to be sorted");
            int[] elements =new int[n];
            for(int i=0;i<n;i++){
                elements[i]=scan.nextInt();
            }
            int[] result =object.Sorted_Array(elements,0,n-1);
            System.out.println("sorted array is:-");
            for(int i=0;i<n;i++){
                System.out.print(result[i]+" ");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
