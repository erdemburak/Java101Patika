package Metotlar;

import java.util.Scanner;

public class RecursiveFibo {

    static int recFib (int number){
        if(number == 1 || number ==2){
            return 1;
        }
        return recFib(number-1)+ recFib(number-2);
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen sayı kadar fibonacci serisi");
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        
        for(int i = 1; i<=sayi ; i++){
            System.out.print(recFib(i)+ " ");
        }
        
        
        input.close();
    }
}
