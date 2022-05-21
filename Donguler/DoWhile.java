package Donguler;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int password;
        boolean askpass = true;
        do{
            System.out.print("Şifre Giriniz : ");
            password = input.nextInt();
            if(password == 1234){
                System.out.println("Giriş başarılı..");
                askpass = false;
            }else{
                System.out.println("Hatalı giriş tekrar girin");
            }
        }
        while (askpass);
        
        input.close();
    }
}