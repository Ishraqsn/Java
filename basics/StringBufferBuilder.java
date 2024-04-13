package Java.basics;

public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuilder sbdr = new StringBuilder("Builder");
        sbdr.append("Object");
        System.out.println(sbdr);

        StringBuffer sbfr = new StringBuffer("Buffer");//16+6
        sbfr.append("Object");
        sbfr.insert(0,"hello");
        System.out.println(sbfr);
        System.out.println(sbfr.capacity());
    }
}
