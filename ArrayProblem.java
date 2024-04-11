public class ArrayProblem {
    public static void main(String[] args) {
        int[] a1 ={2, 3, 4, 5, 6};
        int[] result = multiply(a1);
        for(int i: result){
            System.out.println(i);
        }


    }

    private static int[] multiply(int[] a1) {
        int[] a = new int[a1.length];
        for(int i=0;i<=a1.length-1;i++){
            if(i==0)
                a[i]=a1[i]*a1[i+1];
            else if(i==a1.length-1)
                a[i]=a1[i]*a1[i-1];
            else{
                a[i]=a1[i-1]*a1[i+1];
            }
        }
        return a;
    }
}
