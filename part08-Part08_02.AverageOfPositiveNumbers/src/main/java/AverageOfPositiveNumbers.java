
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positive=new ArrayList<>();
        int num;
        while (true) {            
            num=Integer.valueOf(scanner.nextLine());
            if (num==0) {
                break;
            } else if (num>0) {
                positive.add(num);
            }
        }
        if (positive.isEmpty()) {
            System.out.println("Cannot calculate the average");
        } else {
            int sum=0;
            for (Integer integer : positive) {
                sum+=integer;
            }
            System.out.println(1.0*sum/positive.size());
        }
    }
}
