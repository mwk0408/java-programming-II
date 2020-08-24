/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */

public class Person {
    private String name;
    private Education s;
    public Person (String name, Education s) {
        this.name=name;
        this.s=s;
    }
    public Education getEducation() {
        return this.s;
    }
    public String toString() {
        return this.name+", "+this.s;
    }
}
