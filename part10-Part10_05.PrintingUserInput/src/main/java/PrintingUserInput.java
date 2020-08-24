
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        while (true) {            
            String res=scanner.nextLine();
            if (res.isEmpty()) {
                break;
            }
            list.add(res);
        }
        list.stream()
                .map(s -> s)
                .forEach(s -> System.out.println(s));
    }
}
