package Donguler;

import java.util.Scanner;
public class CifSayilar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, sayi;
        System.out.println("----- Girilen sayıya kadar olan çift sayıların bulunması -----");
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();
        i=1;
        while(i<sayi){
            i++;
            if (i%2 == 1){
                continue;
            }
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("----- Girilen sayıya kadar olan 3 ve 4 e tam bölünebilen sayıların ortalaması -----");
        int sayi1,sayi2;
        System.out.print("Sayı giriniz : ");
        sayi2 = input.nextInt();
        int sayac=0, toplam =0;
        sayi1=0;
        while(sayi1<sayi2){
            sayi1++;
            if((sayi1%3==0) &&(sayi1%4==0)){
                toplam = toplam + sayi1;
                sayac++;
                System.out.print(sayi1 + " ");
            }
        }

        System.out.println();
        int ortalama = toplam / sayac ;
        System.out.println("Sayıların ortamalası : "+ortalama);



        input.close();
    }
}
