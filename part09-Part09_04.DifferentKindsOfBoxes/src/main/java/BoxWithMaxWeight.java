
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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> list;
    public BoxWithMaxWeight(int capacity) {
        this.capacity=capacity;
        this.list=new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        int num=0;
        for (Item item1 : this.list) {
            num+=item1.getWeight();
        }
        if (num+item.getWeight()<=this.capacity) {
            this.list.add(item);
        }
    }
    @Override
    public boolean isInBox(Item item) {
        for (Item item1 : this.list) {
            if (item1.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
