import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Xeven {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input= sc.nextLine();
            List<String> numbers = extractNumbers(input);
            System.out.println(numbers);
            String result="";
            for (String number : numbers) {
                int i=Integer.parseInt(number);
                if(i>9 || i%2==0){
                    System.out.println(i);
                    result=input.replaceAll(number, "0");
                }
            }
            System.out.println(result);
        }
    public static List<String> extractNumbers(String input) {
        List<String> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?"); // Match integers and floating-point numbers

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            numbers.add(matcher.group());
        }

        return numbers;
    }

}

