package Donguler;

import java.util.Scanner;;
public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---- Armstrong Sayı Bulma ----");
        int sayi; 
        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        //Basamak sayisi hesap; 
        int basNumber=0;
        for(int i=sayi; i>0; i/=10){
            basNumber+=1;
        }

        //Basamak değerleri
        int basValue, sonuc=0;
        for(int i = sayi; i>0 ; i/=10){
            basValue=i%10;
            int deger=1;
            for(int j=1; j<=basNumber; j++){
                deger*= basValue;
            }
            sonuc += deger;
        }
        if(sonuc == sayi){
            System.out.println(sonuc +" Sayısı "+sayi+" Sayısına eşit olduğundan armstrong sayıdır.");
        }else{
            System.out.println(sonuc +" Sayısı "+sayi+" Sayısına eşit olmadığından armstrong sayı değildir.");
        }

        
        input.close();
    }
}
