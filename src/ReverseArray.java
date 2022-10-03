import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int [] Array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter any number: ");
            Array[i] = scanner.nextInt();
        }
        System.out.println("Original Array: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed Array: ");
        for (int i = (Array.length - 1); i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
    }
}
