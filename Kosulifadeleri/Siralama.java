package Kosulifadeleri;
import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("1. Sayiyi Giriniz : ");
        a = input.nextInt();
        System.out.print("2. Sayiyi Giriniz : ");
        b = input.nextInt();
        System.out.print("3. Sayiyi Giriniz : ");
        c = input.nextInt();
        
        System.out.println("---- Sayıların Büyükten Küçüğe Sıralanması ----");
        if ( (a >= b) && (a >= c)){
            if (b >= c){
                System.out.println(a + " " + b + " " + c );
            }else {
                System.out.println(a + " " + c + " " + b );
            }
        }else if ((b >= a) && (b >= c)){
            if (a >= c){
                System.out.println(b + " " + a + " " + c );
            }else {
                System.out.println(b + " " + c + " " + a );
            }
        }else {
            if (a >= b){
                System.out.println(c + " " + a + " " + b );
            }else {
                System.out.println(c + " " + b + " " + a );
            }
        }

        System.out.println("---- Sayıların Küçükten Büyüğe Sıralanması ----");
        
        if ( (a <= b) && (a <= c)){
            if (b <= c){
                System.out.println(a + " " + b + " " + c );
            }else {
                System.out.println(a + " " + c + " " + b );
            }
        }else if ((b <= a) && (b <= c)){
            if (a <= c){
                System.out.println(b + " " + a + " " + c );
            }else {
                System.out.println(b + " " + c + " " + a );
            }
        }else {
            if (a <= b){
                System.out.println(c + " " + a + " " + b );
            }else {
                System.out.println(c + " " + b + " " + a );
            }
        }
        
        
        input.close();
    }
}
