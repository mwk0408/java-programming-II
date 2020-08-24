
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory() {
        this.history=new ArrayList<>();
    }
    public void add(double status) {
        this.history.add(status);
    }
    public void clear() {
        this.history.clear();
    }
    public String toString() {
        return this.history.toString();
    }
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double Max=this.history.get(0);
        for (Double double1 : history) {
            if (double1>Max) {
                Max=double1;
            }
        }
        return Max;
    }
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double Min=this.history.get(0);
        for (Double double1 : history) {
            if (double1<Min) {
                Min=double1;
            }
        }
        return Min;        
    }
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum=0;
        for (Double double1 : history) {
            sum+=double1;
        }
        return sum/this.history.size();
    }
}
