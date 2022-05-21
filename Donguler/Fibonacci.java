package Donguler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sayi;
        System.out.println("Fibonacci Serisi");
        System.out.print("Eleman sayısını giriniz : ");
        sayi = input.nextInt();
        int a = 0, b = 1, c = 0;

        for(int i=1; i<sayi;i++){
            c = a + b;
            System.out.println(a+ " + " + b + " = " + c);
            a=b;
            b=c;
        }
        input.close();
    }
}
