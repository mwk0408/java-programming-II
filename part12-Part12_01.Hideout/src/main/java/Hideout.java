/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class Hideout<T> {
    private T value;
    public void putIntoHideout(T toHide) {
        this.value=toHide;
    }
    public T takeFromHideout() {
        if (isInHideout()) {
            T temp=this.value;
            this.value=null;
            return temp;
        }
        return null;
    }
    public boolean isInHideout() {
        return this.value!=null;
    }
}
