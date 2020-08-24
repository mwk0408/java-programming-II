/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class Student extends Person {
    private int credit;
    public Student(String name, String address) {
        super(name, address);
        this.credit=0;
    }
    public void study() {
        this.credit+=1;
    }
    public int credits() {
        return this.credit;
    }
    @Override
    public String toString() {
        return super.toString()+"\n  Study credits "+this.credit;
    }
}
