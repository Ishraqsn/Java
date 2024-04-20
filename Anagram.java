package Java.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String s1="anagram";
        String s2="naramga";
        System.out.println(checkAnagram(s1,s2));
    }

    private static boolean checkAnagram(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        HashMap<Character,Integer> characterCountMap = new HashMap<>();
        for(int i=0;i< s1.length();i++){
            if(characterCountMap.containsKey(s1.charAt(i))){
                characterCountMap.put(s1.charAt(i),characterCountMap.get(s1.charAt(i))+1);
            }else{
                characterCountMap.put(s1.charAt(i),1);
            }
        }
        for(int i=0;i< s2.length();i++){
            if(characterCountMap.containsKey(s1.charAt(i))){
                characterCountMap.put(s1.charAt(i),characterCountMap.get(s1.charAt(i))-1);
            }else{
                return false;
            }
        }

        Set<Character> characterSet = characterCountMap.keySet();
        for(Character c : characterSet){
            if(characterCountMap.get(c)!=0)
                return false;
        }
        return true;
    }
}
