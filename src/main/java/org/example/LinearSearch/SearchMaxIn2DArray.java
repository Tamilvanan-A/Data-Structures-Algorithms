package org.example.LinearSearch;

import org.w3c.dom.ls.LSOutput;

public class SearchMaxIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 120, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        System.out.println(searchMax(arr,target));
    }

    static int searchMax(int[][] arr, int target) {
        int max = Integer.MIN_VALUE;
        for (int[] arrs : arr) {
            for (int element : arrs) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
