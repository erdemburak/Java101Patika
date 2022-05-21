package Donguler;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen sayıya kadar olan asal sayıların ekrana yazılması");
        System.out.print("Max değer girin : ");
        
        int maxDeger = input.nextInt();

        for(int i=2; i<=maxDeger; i++){
            int sayac=0;
            for(int k=2; k<i ; k++){
                if(i%k==0){
                    sayac++;
                    break;
                }
            }
            if(sayac==0){
                System.out.print(i +" ");
            }
        }
        
        input.close();
    }
}
