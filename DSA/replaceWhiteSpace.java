package dsa.strings;

import java.util.Scanner;

public class replaceWhiteSpace {
    public static void main(String[] args) {
        String word;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String  : ");
        word = s.nextLine();
//        System.out.print("Using inbuilt : "+usingInbuilt(word));
        System.out.print("Using inbuilt : "+withoutUsingInbuilt(word));
    }

    private static StringBuilder withoutUsingInbuilt(String word) {
        StringBuilder str = new StringBuilder();
        for(char c:word.toCharArray()){
            if (c!=' '){
                str.append(c);
            }
        }
        return str;
    }

    private static String usingInbuilt(String word) {
        word=word.replaceAll("\\s","");
        return word;
    }

}
