package dsa.strings;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        String word;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String  : ");
        word = s.nextLine();
        System.out.println(countWords(word));
    }

    private static HashMap<String,Integer> countWords(String word) {
        String[] wordArray = word.split(" ");
        HashMap<String,Integer> wordCountMap = new HashMap<>();
        for(String str : wordArray){
            if(wordCountMap.containsKey(str)){
                wordCountMap.put(str, wordCountMap.get(str)+1);
            }else {
                wordCountMap.put(str,1);
            }
        }
        return wordCountMap;
    }
}
