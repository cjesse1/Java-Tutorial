import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] numberArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numberArray));
        System.out.println("Enter number of times to rotate the Array:");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Rotate the Array by n times
        for (int i = 0; i < n; i++){
            int first = numberArray[0], j=0;
            for (j = 0; j < numberArray.length-1; j++){
                numberArray[j] = numberArray[j+1];
            }
            numberArray[j] = first;

        }
        System.out.println();

        System.out.println("Array after rotation:");
        for (int i = 0; i< numberArray.length; i++){
            System.out.print(numberArray[i] + " ");
        }
    }
}
