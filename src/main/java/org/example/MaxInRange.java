package org.example;
public class MaxInRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 22, 9, 18};
        System.out.println(maxRange(arr, 1, 3));
        System.out.println(maxElement(arr));
    }

    static int maxRange(int[] arr, int start, int end) {
        if(start>end) {
            return -1;
        }
        if(arr==null) {
            return -1;
        }
        int maxValue=start;
       for(int i=start;i<=end;i++) {
           if(arr[i]>start) {
               maxValue=arr[i];
           }
       }
       return maxValue;
    }
    static int maxElement(int[]arr) {
        if(arr.length==0) {
            return -1;
        }
        int maxValue=arr[0];
        for(int i=0;i<=arr.length-1;i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
