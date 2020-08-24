
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String>name=new HashMap<>();
        name.put("matthew", "matt");
        name.put("michael", "mix");
        name.put("arthur", "artie");
        System.out.println(name.get("matthew"));
    }
}
