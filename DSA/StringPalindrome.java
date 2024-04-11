package dsa.strings;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String word;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String  : ");
        word = s.nextLine();
        if(checkIsPalindrome(word))
            System.out.print(word + " is Palindrome.");
        else
            System.out.print(word + " is not Palindrome.");
    }

    private static boolean checkIsPalindrome(String word) {
        if (word.length()==1 || word.length()==0)
            return true;
        else {
            int i=0,j=word.length()-1;
            while(i<j){
               if(word.charAt(i)!=word.charAt(j))
                   return false;
               i++;
               j--;

            }
            return true;

        }

    }

}
