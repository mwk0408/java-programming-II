/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class CD implements Packable{
    private String author;
    private String name;
    private double weight;
    private int year;
    public CD(String author, String name, int year) {
        this.author=author;
        this.name=name;
        this.year=year;
        this.weight=0.1;
    }
    public double weight() {
        return this.weight;
    }
    public String toString() {
        return this.author+": "+this.name+" ("+this.year+")";
    }
}
