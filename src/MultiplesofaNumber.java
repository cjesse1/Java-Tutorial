import java.util.Scanner;

public class MultiplesofaNumber {
    // To determine multiples of a number n from 1 - 100
    public static void main(String[]args){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Multiples of " + n);
        for (int i = 1; i <= 100; i++) {
            if (i % n == 0) {
                System.out.println(i + " is a multiple of " + n);
            }
        }
    }
}
