package Donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mükemmel sayı bulma");
        int mukSayi, toplam=0;
        System.out.print("Bir sayı giriniz :");
        int sayi = input.nextInt();

        if(sayi!=1){
            for(int i= 1; i< sayi ; i++){
                if(sayi%i==0){
                    toplam +=i;
                }
            }
            if(toplam == sayi){
                mukSayi=sayi;
                System.out.println(mukSayi+" mükemmel sayıdır.");
            }else{
                System.out.println(sayi + " mükemmel sayı değildir.");
            }
        }else{
            System.out.println("1 mükemmel sayı değildir.");
        }

        
        
        
        input.close();
    }
}
