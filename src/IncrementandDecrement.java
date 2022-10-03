public class IncrementandDecrement {
    public static void main(String[]args){
        int O = 1;
        ++O;
        System.out.println(O);
        //you can apply the ++ and -- as a postfix and prefix
        int P = 1;
        P--;
        System.out.println(P);
        int J = 2;
        int K = J++;
        System.out.println(J);
        System.out.println(K);
        int M = 5;
        int N = ++M;
        System.out.println(M);
        System.out.println(N);
        int H = 8;
        H+=2;
        System.out.println(H);
    }
}
