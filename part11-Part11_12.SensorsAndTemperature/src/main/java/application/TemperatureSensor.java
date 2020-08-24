/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author godknows
 */
public class TemperatureSensor implements Sensor{
    private boolean flag;
    public TemperatureSensor() {
        this.flag=false;
    }
    @Override
    public boolean isOn() {
        return flag;
    }
    @Override
    public void setOn() {
        flag=true;
    }

    @Override
    public void setOff() {
        flag=false;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalArgumentException();
        }
        Random temp=new Random();
        return temp.nextInt(61)-30;
    }
    
}
