/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class Cat extends Animal implements NoiseCapable{
    public Cat(String name) {
        super(name);
    }
    public Cat() {
        this("Cat");
    }
    public void purr() {
        System.out.println(super.getName()+ " purrs");
    }
    public void makeNoise() {
        System.out.println(super.getName()+ " purrs");
    }
}
