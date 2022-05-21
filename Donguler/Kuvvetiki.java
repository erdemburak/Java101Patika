package Donguler;

import java.util.Scanner;
public class Kuvvetiki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi ,sonuc = 1, sonuc2 = 1;
        System.out.println("---- İkinin kuvvetleri ----");
        sayi = input.nextInt();


        for(int i=1 ; i<=sayi ; i++){
            sonuc = sonuc * 2 ;
            System.out.println("2 nin " + i +". kuvveti : " + sonuc);
        }
        
        for(int i=1 ; i<=sayi ; i++){
            sonuc = sonuc * 4 ;
            sonuc2 = sonuc2 * 5 ;
            System.out.print("4 ün " + i +". kuvveti : " + sonuc +" ---");
            System.out.println("5 in " + i +". kuvveti : " + sonuc2);
        }
        
        input.close();
    }
}
