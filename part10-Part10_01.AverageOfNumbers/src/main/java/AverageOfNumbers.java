
import java.util.*;
public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> list = new ArrayList<>();
        String s;
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {            
            s=scanner.nextLine();
            if (s.equals("end")) {
                break;
            }
            list.add(s); 
        }
        double res=list.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: "+res);
    } 
}
