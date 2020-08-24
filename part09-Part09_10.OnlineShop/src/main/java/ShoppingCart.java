/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author godknows
 */
public class ShoppingCart {
    private Map<String, Item> list;
    public ShoppingCart() {
        this.list=new HashMap<>();
    }
    public void add(String product, int price) {
        if (this.list.containsKey(product)) {
            Item temp=this.list.get(product);
            temp.increaseQuantity();
            this.list.put(product, temp);
        } else {
            this.list.putIfAbsent(product, new Item(product,1,price));
        }
    }
    public int price() {
        int sum=0;
        for (Item item : this.list.values()) {
            sum+=item.price();
        }
        return sum;
    }
    public void print() {
        for (Item item : this.list.values()) {
            System.out.println(item);
        }
    }   
}
