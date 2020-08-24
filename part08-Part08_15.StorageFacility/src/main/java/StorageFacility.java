
import java.util.ArrayList;
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> store;
    public StorageFacility() {
        this.store=new HashMap<>();
    }
    public void add(String unit, String item) {
        this.store.putIfAbsent(unit, new ArrayList<String>());
        ArrayList<String> temp=this.store.get(unit);
        temp.add(item);
    }
    public ArrayList<String> contents(String storageUnit) {
        return this.store.getOrDefault(storageUnit, new ArrayList<String>());
    }
    public void remove(String storageUnit, String item) {
        ArrayList<String> temp=this.store.get(storageUnit);
        temp.remove(item);
    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> res=new ArrayList<>();
        for (String string : this.store.keySet()) {
            if (!(this.store.get(string).isEmpty())) {
                res.add(string);
            }
        }
        return res;
    }
}
