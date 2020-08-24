
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String []> list=new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row ->row.split(","))
                    .forEach(part -> list.add(part));
        } catch (Exception e) {
        }
        for (String[] strings : list) {
            strings[2]=strings[2].trim();
            String[] gender = strings[2].split(" ");
            strings[2] = gender[0];          
        }
        list.stream()
                .sorted((s1, s2) -> {
                    return Double.compare(Double.valueOf(s1[5]), Double.valueOf(s2[5]));
                })
                .forEach(s -> System.out.println(s[3]+" ("+s[4]
                +"), "+s[2]+", "+s[5]));
    }
}
