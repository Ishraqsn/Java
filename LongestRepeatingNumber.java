import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingNumber {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,1};
        System.out.println(longestRepeatingInteger(a));
//        System.out.println(longestRepeatingSequenceNumber(a));
    }


    private static int longestRepeatingInteger(int[] a) {
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int i=0;i<a.length-1;i++){
            if(countMap.containsKey(a[i])){
                countMap.put(a[i],countMap.get(a[i])+1);
            }else{
                countMap.put(a[i],1);
            }
        }
        int mostRepeating = 0;
        int result=a[0];
        for(Map.Entry<Integer,Integer> map : countMap.entrySet()){
            if(map.getValue()>mostRepeating){
                result=map.getKey();
                mostRepeating = map.getValue();
            }
        }
        return result;
    }


//    private static int longestRepeatingSequenceNumber(int[] a) {
//        Map<Integer,Map<Integer,Integer>>  indexCountMap = new HashMap<>();
//        for(int i=0;i<a.length-1;i++){
//            if(indexCountMap.containsKey(a[i])){
//                if(a[i]==a[i+1]){
//
//                }
//            }
//        }
//    }
}
