
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author godknows
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> list;
    public VehicleRegistry() {
        this.list=new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate object : this.list.keySet()) {
            if (object.hashCode()==licensePlate.hashCode()) {
                return false;
            }
        }
        this.list.put(licensePlate, owner);
        return true;
    }
    public String get(LicensePlate licensePlate) {
        for (LicensePlate licensePlate1 : this.list.keySet()) {
            if (licensePlate1.hashCode()==licensePlate.hashCode()) {
                return this.list.get(licensePlate1);
            }
        }
        return null;
    }
    public boolean remove(LicensePlate licensePlate) {
        for (LicensePlate licensePlate1 : this.list.keySet()) {
            if (licensePlate1.hashCode()==licensePlate.hashCode()) {
                this.list.remove(licensePlate1);
                return true;
            }
        }
        return false;
    }
    public void printLicensePlates() {
        for (LicensePlate object : this.list.keySet()) {
            System.out.println(object);
        }
    }
    public void printOwners() {
        ArrayList<String> name=new ArrayList<>();
        for (String value : this.list.values()) {
            if (!(name.contains(value))) {
                name.add(value);
            }
        }
        for (String string : name) {
            System.out.println(string);
        }
    }
}
