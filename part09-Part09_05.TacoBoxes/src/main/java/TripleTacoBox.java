/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class TripleTacoBox implements TacoBox{
    private int box;
    public TripleTacoBox() {
        this.box=3;
    }
    public int tacosRemaining() {
        return this.box;
    }
    public void eat() {
        if (this.box>=1) {
            this.box-=1;
        }       
    }
}
