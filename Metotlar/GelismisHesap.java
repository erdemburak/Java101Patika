package Metotlar;

import java.util.Scanner;


public class GelismisHesap {
    static void toplama(){
        Scanner input = new Scanner(System.in);
        int a,b,sonuc=0;
        System.out.print("1. Sayıyı yazın : ");
        a = input.nextInt();
        System.out.print("2. Sayıyı yazın : ");
        b = input.nextInt();
        sonuc = a+b;
        System.out.println("Toplam = " + sonuc);

        input.close();
    }
    static void cıkarma(){
        Scanner sec = new Scanner(System.in);
        int a,b,sonuc=0;
        System.out.print("1. Sayıyı yazın : ");
        a = sec.nextInt();
        System.out.print("2. Sayıyı yazın : ");
        b = sec.nextInt();
        sonuc = a-b;
        System.out.println("Toplam = " + sonuc);

        sec.close();
    }
    static void carpma(){
        Scanner input = new Scanner(System.in);
        int a,b,sonuc=0;
        System.out.print("1. Sayıyı yazın : ");
        a = input.nextInt();
        System.out.print("2. Sayıyı yazın : ");
        b = input.nextInt();
        sonuc = a*b;
        System.out.println("Toplam = " + sonuc);

        input.close();
    }
    static void bolme(){
        Scanner input = new Scanner(System.in);
        int a,b,sonuc=0;
        System.out.print("1. Sayıyı yazın : ");
        a = input.nextInt();
        System.out.print("2. Sayıyı yazın : ");
        b = input.nextInt();

        if(b==0){
            sonuc = 0;
            System.out.println("0'a bölme hatası");           
        }else{
            sonuc = a/b;
            System.out.println("Toplam = " + sonuc);
        }
        input.close();
    }
    static void usAlma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int a = input.nextInt();
        System.out.print("Üs giriniz : ");
        int b = input.nextInt();
        int sonuc=1;
        double dSonuc=1.0;
        if(b>0){
            for(int i = 1; i<=b; i++){
                sonuc *=a;
            }
        }else if(b<0){
            b=b+(2*b);
            for(int i = 1; i<=b; i++){
                dSonuc= 1 / (dSonuc*a);
            }
            System.out.println("Sonuc = " + dSonuc);
        }else{
            sonuc = 1;
        }
        System.out.println("Sonuc = " + sonuc);
        
        input.close();
    }
    static void faktHesap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int sayi = input.nextInt();
        int fakSonuc = 1;
        if(sayi>1){
            for(int i=sayi ; i>1 ; i--){
                fakSonuc *= i; 
            }
        }else if(sayi == 1 || sayi == 0){
            fakSonuc = 1;
        }else{
            System.out.println("Hatalı sayı girdiniz");
        }
        System.out.println("Faktoriyel işleminin sonucu : " + fakSonuc);
        input.close();
    }
    static void modAlma(){
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : "); 
        int sayi2 = input.nextInt();
        int modSonuc= 0, bolum, assist ;
        if(sayi2 == 0){
            System.out.println("Hatalı sayı girişi");
        }else{
            bolum = sayi1 / sayi2;
            assist = sayi2 * bolum;
            modSonuc = sayi1 - assist;
        }
        System.out.println("Mod işleminin sonucu = " + modSonuc);       
        
        input.close();
    }
    static void alanCevre(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ucun kenarı giriniz : ");
        int uKenar = input.nextInt();
        System.out.print("Kısa kenarı giriniz : ");
        int kKenar = input.nextInt();
        
        int alan = uKenar * kKenar;
        int cevre = 2 * (uKenar + kKenar);

        System.out.println("Dörtgenin alanı : " + alan);
        System.out.println("Dörtgenin cevresi : " + cevre);
        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gelişmiş Hesap Makinesi");
        int select;
        do{
            System.out.println("====================================");
            System.out.print("Yapmak istediğiniz işlemi seçiniz\n" +
                        "1 - Toplama\n" +
                        "2 - Çıkarma\n" +
                        "3 - Çarpma\n" +
                        "4 - Bölme\n" +
                        "5 - Üslü Sayı Hesaplama\n" +
                        "6 - Faktoriyel Hesaplama\n" +
                        "7 - Mod Alma\n" +
                        "8 - Dikdörtgen Alan ve Çevre Hesaplama\n" +
                        "0 - Toplama\n" +
                        "Seçiminiz : ");
            select=input.nextInt();
            switch(select){
                case 1:
                    toplama();
                    select=0;
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usAlma();
                    break;
                case 6:
                    faktHesap();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    alanCevre();
                    break;
                case 0:
                    System.out.println("Çıkış yaptınız");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız ");
            }
        }while(select!=0);
        input.close();
    }
}
