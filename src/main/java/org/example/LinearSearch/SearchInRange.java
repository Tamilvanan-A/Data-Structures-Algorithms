package org.example.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[]arr,int target,int start,int end) {
        for(int i=start;i<=end;i++) {
            if(target==arr[i]) {
                return i;
            }
        }
        return -1;
    }
}

