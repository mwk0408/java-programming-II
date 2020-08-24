/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author godknows
 */
public class AverageSensor implements Sensor{
    private List<Sensor> list;
    private List<Integer> total;
    public AverageSensor() {
        this.list=new ArrayList<>();
        this.total=new ArrayList<>();
    }
    public void addSensor(Sensor toAdd) {
        list.add(toAdd);
    }
    @Override
    public boolean isOn() {
        for (Sensor sensor : list) {
            if (!(sensor.isOn())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : list) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : list) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (list.isEmpty()) {
            throw new IllegalStateException();
        }
        int sum=0;
        for (Sensor sensor : list) {            
            sum+=sensor.read();
        }
        total.add(sum/list.size());
        return sum/list.size();
    }
    public List<Integer> readings() {
        return total;
    }
}
