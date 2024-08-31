package org.example;

import java.util.Arrays;

public class SwapAndReverse {
    public static void main(String[] args) {
        int[]arr= {1,3,23,9,18,56};
//        swap(arr,0,4);
//        System.out.println(Arrays.toString(arr));
       reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[]arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            swap(arr,i++,j--);
        }
    }
    static void swap(int[]arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
