import java.util.Arrays;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,5,90,100,-100,200,100};
        int k =100;
        findKSumSubArrays(arr,k);
     }

    private static void findKSumSubArrays(int[] arr, int k) {
        Arrays.sort(arr);
        int length=arr.length-1;
        int left=0;
        int right=length;
        System.out.println(Arrays.toString(arr));
        while(left<=right){

            if(arr[left]+arr[right]==k){
                System.out.println("left"+left);
                System.out.println("right"+right);
                left++;
                continue;
            }
            int sum=0;
            for(int i=left;i<=right;i++){
                sum+=arr[i];
                System.out.println("a[i]"+arr[i]);
                System.out.println("in loop sum"+sum);
            }
            System.out.println("sum"+sum);
            if(sum==k){
                System.out.println("left"+left);
                System.out.println("right"+right);
            }else{
                if(sum>k)
                    right--;
                else
                    left++;
            }

        }
    }
}
