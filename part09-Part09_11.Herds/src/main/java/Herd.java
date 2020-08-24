/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
import java.util.*;
public class Herd implements Movable{
    private List<Movable> list;
    public Herd() {
        this.list=new ArrayList<>();
    }
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }
    public void move(int dx, int dy) {
        for (Movable movable : list) {
            movable.move(dx, dy);
        }
    }
    public String toString() {
        String temp="";
        for (Movable movable : list) {
            temp+=movable;
            temp+="\n";
        }
        return temp;
    }
}
