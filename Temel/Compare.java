package Temel;
public class Compare {
    public static void main(String[] args) {
        int A= 10, B = 20, C = 10, D = 40;
        
        System.out.println(A == B);
        System.out.println(A == C);
        System.out.println(A == D);
        
        System.out.println(A != D);
        System.out.println(A != C);
        System.out.println(A != B);
        
        System.out.println(A > D);
        System.out.println(A > C);
        System.out.println(A > B);

        System.out.println(A >= D);
        System.out.println(A >= C);
        System.out.println(A >= B);

        System.out.println(A < D);
        System.out.println(A < C);
        System.out.println(A < B);

        System.out.println(A <= D);
        System.out.println(A <= C);
        System.out.println(A <= B);
    }
}
