package dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] intArray = {1,1,1,1,2,2,2,3,4,4,5};
        int n=intArray.length;
        int newLength=0;
        //Using extra space if array is sorted, otherwise sort it first
//        int[] intArrayWithoutDuplicates = new int[n];
//        newLength = usingExtraSpace(intArray,n,intArrayWithoutDuplicates);
//        for (int k=0;k<newLength;k++) {
//            System.out.println(intArrayWithoutDuplicates[k]);
//
//        }



        //Without Using extra space
        newLength = withoutUsingExtraSpace(intArray,n);
        for(int i=0;i<newLength+1;i++){
            System.out.println(intArray[i]);
        }

    }

    private static int withoutUsingExtraSpace(int[] intArray,int n) {
        if(n==0 || n==1)
            return n;
        int j=0;
        Arrays.sort(intArray);
        for(int i=1;i<n;i++){
            if(intArray[i]!=intArray[i-1]){
                intArray[++j]=intArray[i];
            }
        }
        return j;
    }

    private static int usingExtraSpace(int[] intArray, int n, int[] intArrayWithoutDuplicates) {

        int j=0;
        for (int i=0;i<intArray.length-1;i++){
            if(intArray[i]!=intArray[i+1]){
                intArrayWithoutDuplicates[j]=intArray[i];
                j++;
            }
        }
        intArrayWithoutDuplicates[j++]=intArray[n-1];
        return j;
    }
}
