package Kosulifadeleri;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b;
        System.out.println("---- Hesap Makinesi ----");
        System.out.print("1. Sayı :");
        a = input.nextInt();
        System.out.print("2. Sayı :");
        b = input.nextInt();
        int i;
        System.out.println("--- Yapmak istediğiniz işlemi seçiniz ---");
        System.out.print("Toplama için -1- \nÇıkarma için -2- \nÇarpma için -3- \nBölme için -4- \nSeçiminiz : ");
        i = input.nextInt();
        
        if(i==1){
            System.out.println("Sonuç :" + (a+b));
        }else if (i==2){
            System.out.println("Sonuç :" + (a-b));
        }else if (i==3){
            System.out.println("Sonuç :" + (a*b));
        }else if (i==4){
            if (b==0){
                System.out.println("Bir sayı 0 a bölünemez.");
            }else{
            System.out.println("Sonuç :"+ (a/b));
            }
        }else{
            System.out.println("Lütfen seçeneklerden birini seçiniz!!!");
        }


        switch (i){
            case 1:
                System.out.println("Sonuç :" + (a+b));
                break;
            case 2:
                System.out.println("Sonuç :" + (a-b));
                break;
            case 3:
                System.out.println("Sonuç :" + (a*b));
                break;
            case 4:
                switch (b){
                    case 0:
                        System.out.println("Bir sayı 0 a bölünemez");
                        break;
                    default: 
                        System.out.println("Sonuç :"+ (a/b));
                }
                break;
            default:
                System.out.println("Lütfen seçeneklerden birini seçiniz!!!");
        } 

        input.close();
    }
}
