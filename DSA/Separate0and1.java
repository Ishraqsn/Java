package dsa.dsRevision.array;

import java.util.Arrays;

public class Separate0and1 {
    public static void main(String[] args) {
       int[] arr = {0,1,0,0,1,1,1,0,1};
       //Simple Solution
//        Count number of 0’s in the array. Lets say we get X 0’s
//        Once we get the count, put X 0’s in the array and put (n-X) 1’s in the latter part of array.
        System.out.println("Solution 1: "+ Arrays.toString(separate0and1(arr)));

        //Second Solution
//        Initialise two index variable , left=0 and right=arr.length-1
//        Increment left variable until you get 1’s.Decrement right variable until you get 0’s
//        If left < right, swap arr[left] and arr[right]
//        In the end, you will see that you have 0’s on left side and 1’s on right side.
        int[] arr2 = {1,1,1,0,0,0};
        System.out.println("Solution 1: "+ Arrays.toString(secondSolution(arr2)));
    }

    private static int[] secondSolution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left=0;
            int right=arr.length-1;
            while(arr[left]==0)
            {
                left++;
            }
            while(arr[right]==1)
            {
                right--;
            }

            if(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
    }

    private static int[] separate0and1(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
                count++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<count)
                arr[i]=0;
            else
                arr[i]=1;
        }
        return arr;
    }
}
