package Temel;
import java.util.Scanner;
public class UserVeriAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ,b;
        System.out.print("A sayısını girin : ");
        a = input.nextInt();
        System.out.print("B sayısını girin : ");
        b = input.nextInt();
        int sonuc;
        sonuc = a+b;
        System.out.println("Sonuc = " + sonuc);
        input.close();
    }
}