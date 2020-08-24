
import java.util.ArrayList;
import java.util.Random;

    public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        for (Integer number1 : numbers) {
            if (number1==number) {
                return true;
            }
        }
        return false;
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random temp=new Random();
        int times=7;
        while (numbers.size()<times) {            
            int num=temp.nextInt(40)+1;
            if (!containsNumber(num)) {
                numbers.add(num);
            }
        }
    }

}
