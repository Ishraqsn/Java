
class BadArgsException extends Exception {}

public class Except {
    public static boolean checkArgs(String[] args) throws Exception {
        if (args.length != 2) {
            throw new BadArgsException();
        }
        return true;
    }

    public static void main(String[] args) {
        args=new String[]{"A","B","C"};
        try {
            Except.checkArgs(args);
        } catch (BadArgsException b) {
            System.out.println("Bad arguments");
            System.exit(-1);
        } catch (Exception e) {
            System.out.println("Unknown exception");
            System.exit(-2);
        }
        System.out.println("Success");
    }
}
