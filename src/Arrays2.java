import java.util.Arrays;

public class Arrays2 {
    public static void main(String[]args){
        int[] numbers = {2,3,5,1,4};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
