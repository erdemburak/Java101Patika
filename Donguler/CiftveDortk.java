package Donguler;

import java.util.Scanner;
public class CiftveDortk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, toplam=0;

        do{
            System.out.print("Sayi giriniz : ");
            sayi1 = input.nextInt();
            if(sayi1%4==0){
                toplam = toplam + sayi1;
            }
        }while(sayi1%2==0);
        System.out.println("Sayıların toplamı : "+toplam);
        
        input.close();
    }
}
