package Donguler;

import java.util.Scanner;
public class YildizUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        System.out.println("Yıldızlar ile Üçgen Yapımı");
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        int k=0, m=sayi;
        for(int i = 1 ; i<=sayi ; i++){
            for(int j = k; j<sayi-1 ; j++){
                System.out.print(" ");
            }
            m--;
            for(int l = m; l<sayi+k ; l++){
                System.out.print("*");
            }
            System.out.println(" ");
            k++;
        }

        for (int a = 0; a < sayi ; a++) {
            for (int b = 1; b < (sayi - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a + 1); c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int tempSayi = sayi;
        for (int a = 1; a < sayi ; a++) {
            for (int b = (sayi - a); b <sayi ; b++) {
                System.out.print(" ");
            }
            for (int c = 1 ; c<(2*tempSayi-2) ; c++) {
                System.out.print("*");
            }
            tempSayi--;
            System.out.println();
        }

        input.close();
    }
}
