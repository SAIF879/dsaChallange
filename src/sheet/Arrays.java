package sheet;

import java.util.ArrayList;
import java.util.HashSet;

public class Arrays {
    public static void fullRotate(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        k = k % length;

        fullRotate(nums, start, end);
        fullRotate(nums, start, k - 1);
        fullRotate(nums, k, end);
        System.out.println(java.util.Arrays.toString(nums));

    }

    public static void naiveSquareSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        java.util.Arrays.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;

    }


    //public static int[] sortedSquares(int[] arr) {}TODO
    

    public static void main(String[] args) {


        //question 1 rotate arrays by factors
       // int num[] = {-1, -100, 3, 99}, k = 2;
        //Output: [3,99,-1,-100]   DONE

        //sq of sorted array
        int  nums[] = {-5,-3,-2,-1};
        //Output: [0,1,9,16,100]
        //naiveSquareSorted(nums);  //nlogn



    }
}