
import java.util.*;
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> list=new ArrayList<>();
        String [] temp;
        String name;
        int age;
        while (true) {            
            System.out.print("Input the name of the book, empty stops: ");
            name=scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            age=Integer.valueOf(scanner.nextLine());
            list.add(new Book(name, age));
        }
        System.out.println("");
        System.out.println(list.size()+" books in total.");
        System.out.println("");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
              .comparing(Book::getAge)
              .thenComparing(Book::getName);
        Collections.sort(list, comparator);
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
