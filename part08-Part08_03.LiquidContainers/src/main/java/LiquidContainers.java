
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=0;
        int second=0;
        int limit=100;
        int rec;
        while (true) {
            System.out.println("First: "+first+"/"+limit);
            System.out.println("Second: "+second+"/"+limit);
            String input = scan.nextLine();
            String[] command=input.split(" ");
            if (input.equals("quit")) {
                break;
            } else if (command[0].equals("add")) {
                rec=Integer.valueOf(command[1]);
                if (rec>0) {                                   
                    if (rec+first>limit) {
                        first=limit;
                    } else {
                        first+=rec;
                    }
                }
            } else if (command[0].equals("move")) {
                rec=Integer.valueOf(command[1]);
                if (rec>0) {
                    if (rec>first) {
                        second+=first;
                        first=0;
                    } else {
                        first-=rec;
                        second+=rec;
                    }
                }
                if (second>limit) {
                    second=limit;
                } 
            } else if (command[0].equals("remove")) {
                rec=Integer.valueOf(command[1]);
                if (rec>0) {
                    if (rec>second) {
                        second=0;
                    } else {
                        second-=rec;
                    }
                }
            }
            System.out.println("");
        }
    }
}
