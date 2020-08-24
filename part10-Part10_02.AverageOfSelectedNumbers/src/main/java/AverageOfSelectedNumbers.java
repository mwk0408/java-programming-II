
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        double neg=list.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .filter(num -> num<0)
                .average()
                .getAsDouble();
        double pos=list.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .filter(num -> num>0)
                .average()
                .getAsDouble();
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p) ");
        String command=scanner.nextLine();
        if (command.equals("n")) {
            System.out.println("Average of the negative numbers: "+neg);
        } else if (command.equals("p")) {
            System.out.println("Average of the negative numbers: "+pos);
        }

    }
}
