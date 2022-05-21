package Donguler;

import java.util.Scanner;;
public class BasamakSayilariT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, basValue, toplam=0; 
        System.out.println("Girilen sayının basamak sayılarının toplanması");
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        for(int i = sayi; i>0; i/=10){
            basValue=i%10;
            toplam+=basValue;
        }
        System.out.println("Girilen sayının basamak değerlerinin toplamı : " + toplam);               
        
        input.close();
    }
}
