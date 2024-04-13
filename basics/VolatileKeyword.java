package Java.basics;

class SharedResource {
    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

//    private volatile boolean flag = false;
    private volatile boolean flag = false;

}
public class VolatileKeyword {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        //Thread 1
        new Thread(()->{
            System.out.println("Thread 1 Started");
            try{
                System.out.println("Thread 1 Started logic");
                Thread.sleep(1000);
                System.out.println("Thread 1 Completed logic");
                sharedResource.setFlag(true);
                System.out.println("Flag set by thread 1");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
                System.out.println("Thread 2 Started logic");
                while (!sharedResource.getFlag()){
                    //executing loop
                }
                System.out.println("Thread 2 Completed logic");
        }).start();
    }

}
