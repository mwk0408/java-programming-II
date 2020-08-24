
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }
    public static boolean validate(int num) {
        if (num%2==0 || num%3==0 || num%5==0) {
            return true;
        }
        return false;
    }
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList<Integer> list=numbers.stream()
                .filter(num -> validate(num))
                .map(num -> num)
                .collect(Collectors.toCollection(ArrayList::new));
        return list;
    }

}
