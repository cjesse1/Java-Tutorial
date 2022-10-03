public class DoubleandInt2 {
    public static void main(String[]args){
        int result = Math.round(1.3F);
        System.out.println(result);
        int result2 = (int)Math.ceil(1.3F);
        System.out.println(result2);
        int result3 = (int)Math.floor(1.3F);
        System.out.println(result3);
        //larger number between 2 integers
        int result4 = Math.max(5,6);
        System.out.println(result4);
        //smaller number between 2 integers
        int result5 = Math.min(5,6);
        System.out.println(result5);
        //smaller number between 2 doubles
        double result6 = Math.min(5.8,6.2);
        System.out.println(result6);
        //random double number between 0 & 1
        double result7 = Math.random();
        System.out.println(result7);
        //random double number between 0 & 10
        double result8 = Math.random()*10;
        System.out.println(result8);
        //random double number between 0 & 100
        double result9 = Math.random()*100;
        System.out.println(result9);
        //random integer between 0 & 100
        int result10 =(int)(Math.random()*100);
        System.out.println(result10);
    }
}
