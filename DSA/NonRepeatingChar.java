package dsa.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String s = "abcdxjabchksjds";
        printFirstNonRepeatingChar(s);
    }

    private static void printFirstNonRepeatingChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for (Map.Entry<Character,Integer> m : map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
            if (m.getValue()==1){
                System.out.println("First Non Repeating Character is :"+m.getKey());
                break;
            }
        }
    }
}
