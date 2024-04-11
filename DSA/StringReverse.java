package dsa.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String word;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String  : ");
        word = s.nextLine();
        System.out.println("Reverse : "+reverseWithInbuilt(word));
        System.out.println("Reverse : "+reverseWithoutInbuilt(word));
    }

    private static String reverseWithoutInbuilt(String word) {
//        char[] charArray = word.toCharArray();
//        for(int i=0,j=word.length()-1;i<j;i++,j--){
//            char temp=charArray[i];
//            charArray[i]=charArray[j];
//            charArray[j]=temp;
//        }
//        word= Arrays.toString(charArray);
//        return word;
        String rev="";
        for(int i=0;i<word.length();i++){
            rev=word.charAt(i)+rev;
        }
        return rev;
    }

    private static StringBuilder reverseWithInbuilt(String word) {
        StringBuilder str = new StringBuilder();
        str=str.append(word);
        str=str.reverse();
        return str;
    }
}
