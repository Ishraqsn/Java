import java.util.*;
public class X {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int i = 10;
        li.add(10);
        int j = li.get(0);
        System.out.println(j);

//        int k = X.count_pairs(new String[]{"A","B"});
        String[] strings= new String[]{"A","B","C"};
        String needle="A";
        int k=findNeedle(needle,strings);
        System.out.println(k);
    }

    private static int findNeedle(String needle, String[] haystack) {
        int count=0;
        for(int i=0;i<haystack.length;++i){
            if(haystack[i]==needle){
                return i;
            }
        }
        return -1;
    }


    private static int count_pairs(String[] strings) {
        int count=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i]==strings[i+1]){}
        }
        return count;
    }
}
