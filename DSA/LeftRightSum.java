package dsa.dsRevision.array;


//Find the element in arrays ,for which sum of LHS=RHS
public class LeftRightSum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,3,8,3};
        if (findLeftRightSum(arr)==-1){
            System.out.println("Element not found!!");
        }else {
            int index = (findLeftRightSum(arr));
            System.out.println("index is " +index);
            System.out.println("Element is " + arr[index]);
        }
     }

    private static int findLeftRightSum(int[] arr) {
        int leftSum =0;
        int rightSum =0;
        for(int j=1;j<arr.length;j++){
            rightSum+=arr[j];
        }
        for (int i=1;i<arr.length;i++){
            leftSum+=arr[i-1];
            rightSum-=arr[i];
            System.out.println(i+" leftSum " +leftSum);
            System.out.println(i+" rightSum "+rightSum);
            if (leftSum==rightSum)
                return i;
        }
        return -1;
    }

}
