package Donguler;

import java.util.Scanner;
public class UsluSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Girilen sayının üssünün hesaplanması ---");
        int sayi, us, sonuc= 1, sonucF=1; 
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        sayi = input.nextInt();
        System.out.print("Üs olacak sayiyi giriniz : ");
        us = input.nextInt();

        int i = 1;
        while (i<=us){
            sonuc *=sayi ;
            i++;
        }
        System.out.println(sayi +" üssü " + us + " = "+ sonuc);
        
        for(int a=1; a<=us;a++){
            sonucF *=sayi ;
        }
        System.out.println(sayi +" üssü " + us + " = "+ sonucF);


        
        input.close();
    }
}
