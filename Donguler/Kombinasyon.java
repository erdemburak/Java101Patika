package Donguler;

import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, fSayi1 =1, fSayi2=1, fakt=1, sonuc ; 
        System.out.println("--- Kombinasyon hesaplama ---");
        System.out.print("Kümenin eleman sayısını giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("Altküme eleman sayısını giriniz : ");
        sayi2 = input.nextInt();

        for (int i = sayi1 ; i>1 ; i--){
            fSayi1 *=i;
        }
        for (int i = sayi2 ; i>1 ; i--){
            fSayi2 *=i;
        }
        for (int i = (sayi1-sayi2) ; i>1 ; i--){
            fakt *=i;
        }

        sonuc = fSayi1 / (fSayi2 * fakt);
        
        System.out.println("C(" + sayi1 + "," + sayi2 + ") = " + sonuc);

        
        input.close();
    }
}
