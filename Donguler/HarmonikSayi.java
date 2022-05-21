package Donguler;

import java.util.Scanner;;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int sayi;
        System.out.println("Girilen sayının harmonik serisini bulan program");
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        double harmSonuc=0.0;
        for(int i=1; i<=sayi; i++){
            harmSonuc += (1.0/i);
        }
        System.out.println("Girilen sayının harmonik serisi : "+harmSonuc);

        
        input.close();
    }
}
