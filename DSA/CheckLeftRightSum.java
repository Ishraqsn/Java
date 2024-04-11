package dsa.arrays;

public class CheckLeftRightSum {
    public static void main(String[] args) {
        int a[] = {2,2,3,4};
        System.out.println(checkLeftRightSum(a));

    }

    private static int checkLeftRightSum(int[] a) {
        if(a.length<3)
            return -1;
        else
            for(int i=2;i<a.length-1;i++){
                int leftSum = 0;
                int rightSum = 0;

                for(int j=0;j<i;j++)
                    leftSum+=a[j];

                for(int k=i+1;k<=a.length-1;k++)
                    rightSum+=a[k];

                System.out.println(leftSum+"\t"+rightSum);
                if (leftSum==rightSum)
                    return i;
            }

          return -1;
    }
}
