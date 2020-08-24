
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    public UserInterface(TodoList list, Scanner scanner) {
        this.list=list;
        this.scanner= scanner;
    }
    public void start() {
        String command;
        String add;
        int remove;
        while (true) {            
            System.out.print("Command: ");
            command=scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                add=scanner.nextLine();
                this.list.add(add);
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                remove=Integer.valueOf(scanner.nextLine());
                this.list.remove(remove);
            }
        }
    }
}
