public class Median {
    public static void main(String[] args) {
        int[] num1={1,2};
        int[] num2={3,4};

        System.out.println(median(num1,num2));
    }

    private static double median(int[] num1, int[] num2) {
        int m = num1.length;
        int n = num2.length;

        int result[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n) {
            if(num1[i]<num2[j]) {
                result[k++] = num1[i++];
            }
            else {
                result[k++] = num2[j++];
            }
        }
        if(i<m) {
            while(i<m)
                result[k++] = num1[i++];
        }
        if(j<n) {
            while(j<n)
                result[k++] = num2[j++];
        }
        n = n+m;
        if(n%2==1)
            return result[((n+1)/2)-1];
        else return ((double)result[(n/2)-1]+(double)result[(n/2)])/2.0;


    }
}
