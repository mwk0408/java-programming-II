
import java.util.HashMap;
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;
    public DictionaryOfManyTranslations() {
        this.dict=new HashMap<>();
    }
    public void add(String word, String translation) {
        this.dict.putIfAbsent(word, new ArrayList<String>());
        ArrayList<String> temp=this.dict.get(word);
        temp.add(translation);
    }
    public ArrayList<String> translate(String word) {
        return this.dict.getOrDefault(word, new ArrayList<String>());
    }
    public void remove(String word) {
        this.dict.remove(word);
    }
}
