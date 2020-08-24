
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
public class Box implements Packable{
    private ArrayList<Packable> list;
    private double limit;
    public Box(double limit) {
        this.list=new ArrayList<>();
        this.limit=limit;
    }
    public void add(Packable item) {
        if (weight()+item.weight()<=this.limit) {
            this.list.add(item);
        }
    }
    public double weight() {
        double weight=0;
        for (Packable packable : list) {
            weight+=packable.weight();
        }
        return weight;
    }
    public String toString() {
        return "Box: "+this.list.size()+" items, total weight "+weight()+" kg";
    }
}
