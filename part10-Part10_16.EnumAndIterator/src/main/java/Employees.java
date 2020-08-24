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
public class Employees {
    List<Person> list;
    public Employees() {
        this.list=new ArrayList<>();
    }
    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            this.list.add(person);
        }
    }
    public void print() {
        Iterator<Person> i=list.iterator();
        while (i.hasNext()) {            
            System.out.println(i.next());
        }
    }
    public void print(Education education) {
        Iterator<Person> i=list.iterator();
        while (i.hasNext()) {            
            Person temp= i.next();
            if (temp.getEducation()==education) {
                System.out.println(temp);
            }
        }
    }
    public void fire(Education education) {
        Iterator<Person> i=list.iterator();
        while (i.hasNext()) {            
            Person temp= i.next();
            if (temp.getEducation()==education) {
                i.remove();
            }
        }
    }
}
