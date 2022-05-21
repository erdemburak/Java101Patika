package Kosulifadeleri;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b; 
        System.out.println("----- Sayı Karşılaştırma -----");
        System.out.print("1. Sayıyı yazınız : ");
        a = input.nextInt();
        System.out.print("2. Sayıyı yazınız : ");
        b = input.nextInt();
    
        String compare = a == b ? "Eşit" : "Eşit Değil";
        System.out.println(compare);

        System.out.println("--- If-Else ile ---");
        if (a==b){
            System.out.println("Eşit");
        }
        else {
            System.out.println("Eşit Değil");
        }

        input.close();
    }
}
