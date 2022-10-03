import java.util.Arrays;

public class Arrays3 {
    public static void main(String[]args) {
        int[][] numbers = new int[3][3];
        numbers[0][1] =1;

        System.out.println(Arrays.deepToString(numbers));

        int[][] number = {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(number));
    }
}
