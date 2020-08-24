
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        int rec;
        while (true) {
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            String input = scan.nextLine();
            String[] command=input.split(" ");
            if (input.equals("quit")) {
                break;
            } else if (command[0].equals("add")) {
                rec=Integer.valueOf(command[1]);
                first.add(rec);
            } else if (command[0].equals("move")) {
                rec=Integer.valueOf(command[1]);
                if (rec>first.contains()) {
                    rec=first.contains();
                }
                first.remove(rec);
                second.add(rec);
            } else if (command[0].equals("remove")) {
                rec=Integer.valueOf(command[1]);
                second.remove(rec);
            }
            System.out.println("");
        }
    }
}
