import java.util.*;
public class Program {

    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }
    public static String arrayAsString(int[][] array)  {
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                res.append(array[i][j]);
            }
            res.append("\n");
        }
        return res.toString();
    }
}
