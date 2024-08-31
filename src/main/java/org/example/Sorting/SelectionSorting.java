package org.example.Sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[]arr) {
        int start=0;
        int end =arr.length-1;
        for(int i=start;i<=end;i++) {
            int last=arr.length-i-1;
            int max=getMaxValue(arr,start,last);
            swap(arr,max,last);
        }
    }
    static void swap(int[]arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxValue(int[]arr,int start,int end) {
        int max=start;
        for(int i=start;i<=end;i++) {
            if(arr[i]>arr[max]) {
                max=i;
            }
        }
        return max;
    }
}
