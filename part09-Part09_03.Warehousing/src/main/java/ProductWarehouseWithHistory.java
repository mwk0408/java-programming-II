/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history=new ChangeHistory();
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history.add(initialBalance);
    }
    public String history() {
        return this.history.toString();
    }
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        double res=super.getBalance();
        this.history.add(res);
    }
    public double takeFromWarehouse(double amount) {
        double temp=super.takeFromWarehouse(amount);
        double res=super.getBalance();
        this.history.add(res);
        return temp;
    }
    public void printAnalysis() {
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+history());
        System.out.println("Largest amount of product: "+history.maxValue());
        System.out.println("Smallest amount of product: "+history.minValue());
        System.out.println("Average: "+history.average());
    }
}
