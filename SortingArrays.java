import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] a = {6,2,1,4,5,8,10,3};
        int[] result = mergeSort(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    private static int[] mergeSort(int[] a) {
        int even=0,odd=0;
        for(int i : a){
            if(i%2==0)
                even++;
            else
                odd++;
        }
        int[] oddArray = new int[odd];
        int[] evenArray = new int[even];
        int evenIndex =0;
        int oddIndex = 0;
        for(int i : a){
            if (i%2==0){
                evenArray[evenIndex]=i;
                evenIndex++;
            }
            else
            {
                oddArray[oddIndex]=i;
                oddIndex++;
            }
        }
        Arrays.sort(evenArray);
        Arrays.sort(oddArray);
        int k=0;
        int[] result = new int[a.length];
        for(int j=oddArray.length-1;j>=0;j--){
            result[k]=oddArray[j];
            k++;
        }
        for (int i=0;i<=evenArray.length-1;i++){
            result[k]=evenArray[i];
            k++;
        }
        return result;
    }
}
