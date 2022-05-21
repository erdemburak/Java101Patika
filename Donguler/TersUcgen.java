package Donguler;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi; 
        System.out.println("Ters Ucgen");
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();
        int m=sayi, tempSayi=sayi ;
        for(int i = 0; i<sayi; i++){
            for(int k=m ; k<sayi; k++){
                System.out.print(" ");
            }
            m--;
            for(int n=1; n<(2*tempSayi); n++){
                System.out.print("*");
            }
            tempSayi--;
            System.out.println();
        }

        
        
        
        input.close();
    }
}
