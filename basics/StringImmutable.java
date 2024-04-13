package Java.basics;

public class StringImmutable {
    public static void main(String[] args) {
        //In Pool
        String immutable = "Hello";

        //In Heap
        String s2 = immutable.concat("World");

        //In Pool
        String s3 = immutable.concat("World").intern();

        //intern() method is used to ensure that all strings with the same content share the same memory location.

        String str1 = "hello";
        String str2 = new String("hello");

        // Using intern() method to ensure both strings point to the same memory location
        String str3 = str2.intern();

        // Now str1, str2, and str3 all refer to the same string object in the string pool
        System.out.println(str1 == str2); // Output: false
        System.out.println(str1 == str3); // Output: true
        System.out.println(str2 == str3); // Output: true

        //In heap
        String s4 = new String("Hello World");



    }
}
