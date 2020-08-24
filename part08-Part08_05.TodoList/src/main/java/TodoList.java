
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class TodoList {
    private ArrayList<String> list;
    public TodoList() {
        this.list=new ArrayList<>();
    }
    public void add(String task) {
        this.list.add(task);
    }
    public void print() {
        int index=0;
        for (String string : this.list) {
            System.out.println((index+1)+": "+string);
            index++;
        }
    }
    public void remove(int number) {
        if (number<this.list.size()) {
            this.list.remove(number-1);
        }
    }
}
