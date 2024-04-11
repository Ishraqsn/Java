import java.util.*;
import java.util.stream.Collectors;

public class Student {
    String name;
    Integer marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getMin(List<Student> ls){
        int min=99999999;
        Student minMarks =null;
        for(Student st : ls){
            if(st.getMarks()<min){
                min=st.marks;
                minMarks=st;
            }
        }
        return minMarks.getName();
    }


    public static void main(String[] args) {
//        List<Student> stList = new ArrayList<>();
//        stList.add(new Student("A",70));
//        stList.add(new Student("B",40));
//        stList.add(new Student("C",60));
//        String sname = stList.stream().filter(student -> student.getMin(stList));
//        String sname2 = stList.stream().min(Student::getMarks,Comparator<>);

        String s = "abcxdcyab";

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
//        char[] chArray = s.toCharArray();
//        for(Character c : chArray){
//            if(map.containsKey(c))
//                map.put(c,map.get(c)+1);
//            else
//                map.put(c,1);
//
//        }
        Character c1 =null;
        for(Map.Entry m : map.entrySet()){
            Integer count = (Integer) m.getValue();
            if(count.equals(1)) {
                c1 = (Character) m.getKey();
                break;
            }
        }
        System.out.println(c1);

        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }
}


