package dsa.dsRevision.array;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] strArr = {"One","Two","Three"};

        System.out.println("Array elements are:");
        // Iterate over array
        for (int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);
        }
        System.out.println("====================");
        System.out.println("Printing array elements using Arrays.toString():");
        System.out.println("====================");
        // You can also use Arrays.toString() to print an array
        System.out.println(Arrays.toString(strArr));
    }
}
