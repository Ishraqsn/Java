//Given two non-negative integers num1 and num2 represented as strings,
// return the product of num1 and num2, also represented as a string.
//        Note: You must not use any built-in BigInteger library or convert
//        the inputs to integer directly.
//
//        Example 1:
//        Input: num1 = "2", num2 = "3"Output: "6"
public class StringNum {
    public static void main(String[] args) {
        String num1="2";
        String num2="3";
        System.out.println(multiply(num1,num2));

    }

    private static String multiply(String num1, String num2) {
        Integer int1 = convertStringToNum(num1);
        Integer int2 = convertStringToNum(num2);

        Integer product = int1*int2;

        return convertIntegerToString(product);

    }

    private static String convertIntegerToString(Integer product) {
        int i = product;
        char c = (char) i;
        return String.valueOf(c);
//        return String.valueOf(product);
    }

    private static Integer convertStringToNum(String num) {
        char c = num.charAt(0);
        int i = (int) c;
        return i;
//        return Integer.valueOf(num);
    }
}
