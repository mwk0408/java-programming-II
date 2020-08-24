/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author godknows
 */
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
public class SaveableDictionary {
    private Map<String, String> list;
    private String file;
    public SaveableDictionary(String file) {
        this.list=new HashMap<>();
        this.file=file;
    }
    public SaveableDictionary() {
        this.list=new HashMap<>();
    }
    public void add(String words, String translation) {
        list.putIfAbsent(words, translation);
    }
    public String translate(String word) {
        for (Map.Entry<String, String> entry : list.entrySet()) {
            if (entry.getKey().equals(word)) {
                return entry.getValue();
            } else if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }
        return null;
    }
    public void delete(String word) {
        for (Map.Entry<String, String> entry : list.entrySet()) {
            if (entry.getKey().equals(word)) {
                list.remove(entry.getKey(), entry.getValue());
                break;
            } else if (entry.getValue().equals(word)) {
                list.remove(entry.getKey(), entry.getValue());
                break;
            }
        }
    }

    public boolean load() {
        try (Scanner reader = new Scanner(new File(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");   
                add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(file)){
            for (Map.Entry<String, String> entry : list.entrySet()) {
                writer.println(entry.getKey()+":"+entry.getValue());
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
