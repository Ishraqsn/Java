package Java.basics;

public class StringBufferThreadSafe {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        //check def of append method of both, stringBuffer has synchronization

        Thread t1 = new Thread(()->{
           for(int i=1;i<=1000;i++){
               stringBuffer.append("A");
               stringBuilder.append("A");
            }
        });


        Thread t2 = new Thread(()->{
            for(int i=1;i<=1000;i++){
                stringBuffer.append("A");
                stringBuilder.append("A");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        };

        System.out.println("stringBuilder" +stringBuilder.toString().length());

        //replace stringBuilder to stringBuffer
        System.out.println("stringBuffer"+stringBuffer.toString().length());
    }
}
