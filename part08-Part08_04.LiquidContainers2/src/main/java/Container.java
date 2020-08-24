/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class Container {
    private int num;
    private int limit;
    public Container() {
        this.num=0;
        this.limit=100;
    }
    public int contains() {
        return this.num;
    }
    public void add (int amount) {
        if (amount>0) {
            if (this.num+amount>limit) {
                this.num=limit;
            } else {
                this.num+=amount;
            }
        }
    }
    public void remove (int amount) {
        if (amount>0) {
            if (amount>this.num) {
                this.num=0;
            } else {
                this.num-=amount;
            }
        }
    }
    public String toString() {
        return this.num+"/"+this.limit;
    }
}
