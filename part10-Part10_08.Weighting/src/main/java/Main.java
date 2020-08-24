
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int res =list.stream()
                .mapToInt(num ->num)
                .reduce(0, (sum, value) -> (sum+value));
        System.out.println(res);
   }
}
