package Metotlar;

import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number){
        int tempSayi, tersSayi=0,lastNumber;
        tempSayi = number;
        while(tempSayi!=0){
            lastNumber = tempSayi % 10 ; 
            tempSayi /=10;
            tersSayi = (tersSayi*10)+lastNumber;
        }
        if(number == tersSayi){
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Girilen sayının palindrom sayı olup olmadığını bulan program");
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        
        if(isPalindrom(sayi)){
            System.out.println(sayi + " Palindrom sayıdır");
        }else {
            System.out.println(sayi + " Palindrom sayı değildir");
        }


        input.close();
    }
}
