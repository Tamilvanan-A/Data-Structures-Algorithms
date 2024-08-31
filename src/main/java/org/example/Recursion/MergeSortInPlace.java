package org.example.Recursion;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[]arr,int start,int end) {
        if(end-start==1) {
            return;
        }
        int mid=start+(end-start)/2;
        mergeSortInPlace(arr,0,mid);
        mergeSortInPlace(arr,mid, end);

        mergeSort(arr,start,mid,end);
    }
    static void mergeSort(int[] arr,int start,int mid, int end) {
        int[] mix=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while (i<mid && j<end) {
            if(arr[i]<arr[j]) {
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<mid) {
                mix[k]=arr[i];
                i++;
                k++;
        }
        while (j<end) {
                mix[k]=arr[j];
                j++;
                k++;
        }
        for (int l=0;l<mix.length;l++) {
            arr[start+l]=mix[l];
        }
    }
}
