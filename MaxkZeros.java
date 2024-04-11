//Given a binary array nums and an integer k, return the maximum number of
// consecutive 1's in the array if you can flip at most k 0's.
//
//
//        Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2 Output: 6
//        Explanation: [1,1,1,0,0,1,1,1,1,1,1,0]

public class MaxkZeros {
    public static void main(String[] args) {
        int[] a={1,1,1,0,0,0,1,1,1,1,0};
        int[] b={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        System.out.println(printSubArray(b,k));
    }

    private static int printSubArray(int[] a, int k) {
        int left=0;
        int right=1;
        int countOnes =0;
        int countZeroes =0;
        int subArrayMaxLength=0;
        int arrayLength = a.length-1;
        while(right<arrayLength){
            System.out.println("right"+right);
            if(a[right-1]==1){
                if(a[right]==1){
                    right++;
                    countOnes++;
                }
            }
            if(a[right-1]==0){
                if (a[right]!=1){
                    if(countZeroes!=k){
                        countZeroes++;
                        right++;
                    }else{
                        left++;
                        right++;
                    }
                }
            }
            if(a[right-1]==1){
                if(a[right]==0){
                    if(countZeroes!=k){
                        countZeroes++;
                        right++;
                    }else{
                        right++;
                    }
                }
            }
            if(countOnes>subArrayMaxLength && countZeroes==k){
                subArrayMaxLength=right-left+1;
                countZeroes=0;
            }
            System.out.println("Ones"+countOnes);
        }
        return countOnes;
    }
}
