package Metotlar;

import java.util.Scanner;

public class RecAsalSayi {
    static boolean recAsal(int sayi, int sayac){
        boolean deger = false;
        if(sayi == sayac){
            return true;
        }else{
            if(sayi%sayac==0){
                deger = false;
            }else{
                deger = true;
            }
        }
        sayac++;
        return (deger && recAsal(sayi,sayac));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen sayının asal olup olmadığını recursive fonksiyon ile bulma");
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        int sayac = 2;
        if(recAsal(sayi,sayac)){
            System.out.println(sayi + " sayısı ASALDIR !");
        }else{
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
        input.close();
    }
}
