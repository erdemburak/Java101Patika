package Donguler;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rep, sayi,ilkSayi, enkucuk, enbuyuk;
        System.out.println("Girilen sayıların min ve max değerlerini bulma");
        System.out.print("Kaç tane sayı gireceksiniz : ");
        rep = input.nextInt();


        System.out.print("1. sayıyı giriniz : ");
        ilkSayi = input.nextInt();
        enkucuk=ilkSayi;
        enbuyuk=ilkSayi;
        for(int i = 2; i<=rep; i++){
            System.out.print(i+". sayıyı giriniz : ");
            sayi = input.nextInt();
            if(sayi <=enkucuk){
                enkucuk = sayi;
            }
            if(sayi >=enbuyuk){
                enbuyuk = sayi;
            }
        }
        System.out.println("En küçük sayı : " + enkucuk);
        System.out.println("En büyük sayı : " + enbuyuk);
        input.close();
    }
}
