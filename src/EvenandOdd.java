import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //If NUMBER is odd print "Weird"
        if (N % 2 != 0 && N > 0 && N < 101) {
            System.out.println("Weird");
            //If NUMBER is even and between 2-5 print "Not Weird"
        } else if ((N % 2 == 0) && N > 1 && N < 6) {
            System.out.println("Not Weird");
            //If NUMBER is even and between 6-20 print "Weird"
        } else if (N % 2 == 0 && N > 5 && N < 21) {
            System.out.println("Weird");
            //If NUMBER is even and greater than 20 print "Not Weird"
        } else if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }else {
            System.out.println("N is not within range of numbers!");
        }
    }
}
