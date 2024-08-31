package org.example.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170,200,250,300,350};
        int target = 100;
        System.out.println(ans(arr, target));
    }
    static int ans(int[]arr,int target) {
        int start=0;
        int end=1;
        // we dont know the length of the Array , so we can take the junks pf array and will increase the 2X length
        while(target>arr[end]) {
            int temp=end+1; //new start
            //new box= previous end+2*size of the array(previous one)
            end=end+ (end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start,int end) {
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(target<arr[mid]) {
                end=mid-1;
            }else if(target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
