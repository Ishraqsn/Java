import java.util.*;

public class DuplicateIntegers {
    public static void main(String[] args) {
        Integer[] array = {1,1,3,2,4,3,4,8,7,9,5,4,5,5,6,6,8};
        List<Integer> arrayList = Arrays.asList(array);
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer integer : arrayList){
            if(map.containsKey(integer)){
                map.put(integer,map.get(integer)+1);
            }else {
                map.put(integer,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
