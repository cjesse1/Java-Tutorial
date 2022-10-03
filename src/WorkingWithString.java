public class WorkingWithString {
    public static void main(String[]args){
        String message = "hello world";

        //To determine if message ends With "hello"
        System.out.println(message.endsWith("hello"));
        //To determine if message starts With "hello"
        System.out.println(message.startsWith("hello"));
        //To determine message length
        System.out.println(message.length());
        //To determine index Of a letter
        System.out.println(message.indexOf("o"));
        //To replace a word With another word
        System.out.println(message.replace("world", "son"));
        //To print message
        System.out.println(message);
        //To trim message
        System.out.println(message.trim());
        //To change to LowerCase
        System.out.println(message.toLowerCase());
        //To change to UpperCase
        System.out.println(message.toUpperCase());
    }
}
