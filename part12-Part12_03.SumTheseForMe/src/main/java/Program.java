
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int low= (fromWhere<0) ? 0 : fromWhere;
        int high= (toWhere>array.length) ? array.length : toWhere;
        int sum=0;
        for (int i = low; i < high; i++) {
            if (array[i]>=smallest && array[i]<=largest) {
                sum+=array[i];
            }
        }
        return sum;
    }
}
