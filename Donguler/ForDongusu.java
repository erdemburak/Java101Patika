package Donguler;

import java.util.Scanner;
public class ForDongusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        for (a= 1; a<=10 ; a++){
            for(b = 1; b<=10;b++){
                System.out.print(b);
            }
            System.out.println();
        }



        for (boolean run = true ; run;){
            System.out.print("Sayı giriniz : ");
            int sayi = input.nextInt();
            if (sayi < 0){
                run = false ;
                System.out.println("Bitti");
            }
        }
        int sayi2;
        do {
            System.out.print("Sayı giriniz : ");
            sayi2 = input.nextInt();
        }while (sayi2 >0);

        input.close();
    }
}
