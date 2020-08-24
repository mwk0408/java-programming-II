
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int res;
        while (true) {            
            res=Integer.valueOf(scanner.nextLine());
            if (res<0) {
                break;
            }
            list.add(res);
        }
        list.stream()
                .filter(n -> n>=1 && n <=5)
                .map(n ->n)
                .forEach(n ->System.out.println(n));
    }
}
