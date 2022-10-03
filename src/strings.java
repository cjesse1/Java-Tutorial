public class strings {
    public static void main(String[]args){
        String A = "hello";
        String B = "java";
        //To print total length of two strings
        System.out.println(A.length() + B.length());

        //To determine the string in which the first letter comes first
        if (A.compareTo(B) > 0){
            System.out.println("YES");
        } else if (A.compareTo(B) < 0) {
            System.out.println("No");
        }
        //To capitalise the first letter of two strings
        String newA = A.substring(0,1).toUpperCase() + A.substring(1);
        String newB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(newA + " "+  newB);

    }
}
