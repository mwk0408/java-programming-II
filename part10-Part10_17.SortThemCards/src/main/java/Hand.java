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
public class Hand implements Comparable<Hand>{
    private List<Card> list;
    public Hand() {
        this.list=new ArrayList<>();
    }
    public void add(Card card) {
        this.list.add(card);
    }
    public void print() {
        for (Card card : list) {
            System.out.println(card);
        }
    }
    public void sort() {
        Collections.sort(list);
    }
    public int total() {
        int sum=0;
        for (Card card : list) {
            sum+=card.getValue();
        }
        return sum;
    }
    @Override
    public int compareTo(Hand hand) {
        int sum=0;
        for (Card card : list) {
            sum+=card.getValue();
        }
        if (sum>hand.total()) {
            return 1;
        } else if (sum==hand.total()) {
            return 0;
        } else {
            return -1;
        }
    }
    public void sortBySuit() {
        Collections.sort(this.list, new BySuitInValueOrder());
    }
}
