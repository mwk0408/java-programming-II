
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class IOU {
    private HashMap<String, Double> sum;
    public IOU() {
        this.sum=new HashMap<>();
    }
    public void setSum(String toWhom, double amount) {
        double num=this.sum.getOrDefault(toWhom, 0.0);
        num+=amount;
        this.sum.put(toWhom, num);
    }
    public double howMuchDoIOweTo(String toWhom) {
        return this.sum.getOrDefault(toWhom, 0.0);
    }
}
