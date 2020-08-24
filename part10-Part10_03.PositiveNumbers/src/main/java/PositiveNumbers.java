
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> res= numbers.stream()
                .filter(num -> num>0)
                .map(num -> num)
                .collect(Collectors.toCollection(ArrayList::new));
        return res;
    }
}
