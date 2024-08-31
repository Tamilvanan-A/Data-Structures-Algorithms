package org.example.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int cyclicSort(int[]arr) {
        int i=0;
        while(i< arr.length) {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]) {
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[]arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
