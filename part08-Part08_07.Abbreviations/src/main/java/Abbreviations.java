
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
public class Abbreviations {
    private HashMap<String ,String> list;
    public Abbreviations() {
        this.list=new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation) {
        String temp=transformString(abbreviation);
        if (!(this.list.containsKey(temp))) {
            this.list.put(temp, explanation);
        }
    }
    public boolean hasAbbreviation(String abbreviation) {
        return this.list.containsKey(transformString(abbreviation));
    }
    public String findExplanationFor(String abbreviation) {
        return this.list.get(transformString(abbreviation));
    }
    public String transformString(String word) {
        if (word==null) {
            return "";
        }
        word=word.toLowerCase();
        return word.trim();
    } 
}
