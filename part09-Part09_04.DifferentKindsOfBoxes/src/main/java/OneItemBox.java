
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
public class OneItemBox extends Box {
    private ArrayList<Item> list;
    public OneItemBox() {
        this.list=new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if (this.list.size()<1) {
            this.list.add(item);
        }
    }
    @Override
    public boolean isInBox(Item item) {
        for (Item item1 : list) {
            if (item1.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
