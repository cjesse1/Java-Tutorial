import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter any word or number");

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reverseword = "";
        //To determine if a word is a palindrome

        for (int i = (word.length() - 1); i >= 0; i--)
            reverseword = reverseword + word.charAt(i);

        if (word.toLowerCase().equals(reverseword.toLowerCase())){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
