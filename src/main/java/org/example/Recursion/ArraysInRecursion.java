package org.example.Recursion;

import java.util.ArrayList;

public class ArraysInRecursion {
    public static void main(String[] args) {
        int[] arr= {1,3,4,4,5};
        System.out.println(find(arr,3,0));
        System.out.println(findIndex(arr,5,0));
        System.out.println(findIndexLast(arr,3,arr.length-1));
       System.out.println(findIndexElements(arr,4,0));
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(findIndexElement1(arr,4,0,list));
        findIndexElement3(arr,4,0);
        System.out.println(list);
    }
    static boolean find(int[]arr,int target,int index) {
            if(index==arr.length) {
                return false;
            }
            return arr[index] ==target || find(arr,target,index+1);
    }
    static int findIndex(int[]arr,int target,int index) {
        if(index==arr.length) {
            return -1;
        }
        if(arr[index]==target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
    static int findIndexLast(int[]arr,int target,int index) {
        if(index==-1) {
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }else {
            return findIndexLast(arr,target,index-1);
        }
    }
    static ArrayList<Integer> findIndexElements(int[]arr,int target,int index) {
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length) {
            return list;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        ArrayList<Integer> ansBelowCalls= findIndexElements(arr,target,index+1);
        list.addAll(ansBelowCalls);
        return list;
    }
    static ArrayList<Integer> findIndexElement1(int[]arr,int target,int index,ArrayList<Integer>list) {
        if(index==arr.length) {
            return list;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        findIndexElement1(arr,target,index+1,list);
        return list;
    }

    static ArrayList<Integer>list=new ArrayList<>();
    static void findIndexElement3(int[]arr,int target,int index) {
        if(index==arr.length) {
            return;
        }
        if(arr[index]==target) {
            list.add(index);
        }
        findIndexElement3(arr,target,index+1);
    }
}
