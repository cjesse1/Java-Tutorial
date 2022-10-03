public class Arrays {
    public static void main(String[]args){
        int[] numbers = new int[5];
        System.out.println(java.util.Arrays.toString(numbers));
        numbers[2] = 1;
        numbers[1] = 2;
        numbers[4] = 10;
        System.out.println(numbers[4]);
        System.out.println(numbers.length);
        System.out.println(java.util.Arrays.toString(numbers));
        java.util.Arrays.sort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
