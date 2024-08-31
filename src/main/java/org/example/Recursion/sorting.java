package org.example.Recursion;

public class sorting {
    public static void main(String[] args) {
       int[]arr={1,1,1,3,3,4,3,2,4,2};
       boolean ans=duplicate(arr);
        System.out.println(ans);
    }
    static boolean duplicate(int[] nums) {
        cyclicSort(nums);
        for(int index=0;index<nums.length-1;index++) {
            if(nums[index]==nums[index+1]) {
                return true;
            }
        }
        return false;
    }
        static void cyclicSort(int[]arr) {
            boolean swapped;
            // run the steps n-1 times
            for (int i = 0; i < arr.length; i++) {
                swapped = false;
                // for each step, max item will come at the last respective index
                for (int j = 1; j < arr.length - i; j++) {
                    // swap if the item is smaller than the previous item
                    if (arr[j] < arr[j-1]) {
                        // swap
                       swap(arr,j,j-1);
                        swapped = true;
                    }
                }
                // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
                if (!swapped) { // !false = true
                    break;
                }
            }
        }
        static void swap(int[]arr,int i,int j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
