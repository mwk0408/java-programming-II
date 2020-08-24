/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class List<Type> {
    private Type[] values;
    private int index;

    public List() {
        this.values = (Type[]) new Object[10];
        this.index=0;
    }
    public void add(Type value) {
        if (index==values.length) {
            grow();
        }
        values[index]=value;
        index++;
    }
    public void grow() {
        int size = values.length+values.length/2;
        Type[] values2 = (Type[]) new Object[size];
        for (int i = 0; i < values.length; i++) {
            values2[i]=values[i];
        }
        values=values2;
    }
    public boolean contains(Type value) {
        return element(value)>=0;
    }
    public void remove(Type value) {
        int n=element(value);
        if (n<0) {
            return;
        }
        for (int i = n; i < index-1; i++) {
            values[i]=values[i+1];
        }
        index--;
    }
    public int element(Type value) {
        for (int i = 0; i < index; i++) {
            if (values[i].equals(values) || values[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public Type value(int index) {
        if (index < 0 || index >= this.index) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.index + "]");
        }

        return values[index];
    }
    public int size() {
        return index;
    }
}
 