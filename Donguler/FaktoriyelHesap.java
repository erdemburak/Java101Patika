package Donguler;

import java.util.Scanner;
public class FaktoriyelHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, sonuc = 1; 
        System.out.println("---- Faktöriyel Hesaplama ----");
        System.out.print("Sayi giriniz : ");
        sayi = input.nextInt();

        if(sayi == 0){
            sonuc = 1;
            System.out.println(sayi +" sayısının faktöriyeli : " +sonuc);
        }else if(sayi <0){
            System.out.println("Hatalı sayı girdiniz..");
        }else{
            for (int i = sayi ; i>1 ; i--){
                sonuc *=i;
            }
            System.out.println(sayi +" sayısının faktöriyeli : " +sonuc);
        }
        

        
        input.close();
    }
}
