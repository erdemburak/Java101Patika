package Kosulifadeleri;
import java.util.Scanner;
public class VucutKitleIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, kindex;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        
        kindex = kilo / Math.pow(boy, 2);
        System.out.println("Vücut Kitle Indexiniz : " + kindex);
        
        if (kindex <=18.4)
            {
                String durum = "Zayıf";
                System.out.print("Durumunuz : " + durum);
            }
        else if(kindex <=24.9)
            {
                String durum = "Normal";
                System.out.print("Durumunuz : " + durum);
            }   
        else if(kindex <=29.9)
            {
                String durum = "Fazla Kilolu";
                System.out.print("Durumunuz : " + durum);
            }
        else if(kindex <=34.9)
            {
                String durum = "Şişman";
                System.out.print("Durumunuz : " + durum);
            }
        else if(kindex <=44.9)
            {
                String durum = "Aşırı kilolu";
                System.out.print("Durumunuz : " + durum);
            }
        
        
        input.close();
    }
}