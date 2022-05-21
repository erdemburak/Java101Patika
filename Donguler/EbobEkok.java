package Donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sayi1, sayi2, ebob=0;
        System.out.println("Ebob - Ekok Hesaplama");
        System.out.print("1. Sayıyı giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        sayi2 = input.nextInt();

        
        if(sayi1>sayi2){
            for(int i=sayi2; i>=1; i--){
                if(sayi1%i == 0 && sayi2%i == 0){
                    System.out.println("Girilen sayıların EBOB'u : " + i );
                    ebob = i;
                    break;
                }
            }
        }else if(sayi1<sayi2){
            for(int i=sayi1; i>=1; i--){
                if(sayi1%i == 0 && sayi2%i == 0){
                    System.out.println("Girilen sayıların EBOB'u : " + i );
                    ebob = i;
                    break;
                }
            }
        }else{
            ebob = sayi1;
            System.out.println("Sayılar eşit olduğu için EBOB'u : " + ebob);
        }

        double ekok;
        ekok = (sayi1*sayi2) / ebob;
        System.out.println("Girilen sayıların EKOK'u : " + ekok);

        input.close();
    }
}
