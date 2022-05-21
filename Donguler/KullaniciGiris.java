package Donguler;

import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password;

        boolean passwordSuccess = false; 

        while (!passwordSuccess) {
            System.out.print("Şifre Giriniz : ");
            password = input.nextInt();
            if(password == 1234){
                System.out.println("Giriş başarılı..");
                passwordSuccess = true;
            }else{
                System.out.println("Hatalı giriş tekrar girin");
            }
        }
        input.close();
    }
}
