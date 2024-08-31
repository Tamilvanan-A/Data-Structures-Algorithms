package org.example.LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        System.out.println(linearSearch(nums,target));
    }
    static int linearSearch (int[]arr,int target) {
        if(arr.length==0) {
            return -1;
        }
        for(int arrs:arr) {
            if(arrs==target) {
                return arrs;
            }
        }
        return -1;
    }
}
