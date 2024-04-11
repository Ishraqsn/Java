import java.util.HashMap;
import java.util.LinkedHashMap;

public class RepeatingCharacters {
    public static void main(String[] args) {
        String str= "aaaabbcbbbb";
        Character c= printMostRepeating(str);
        System.out.println(c);
    }

    private static Character printMostRepeating(String str) {
        Character result=null;
        HashMap<Character,Integer> charMap = new LinkedHashMap<>();
        int maxLength=1;
        int left=1;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)==str.charAt(left-1)){
                result=str.charAt(right);
                maxLength++;
            }else{
                maxLength=1;
                result=str.charAt(left+1);
            }
            left++;
        }
        return result;
    }
}
