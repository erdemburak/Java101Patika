package Metotlar;

import java.util.Scanner;
public class RecUslusayilar {
    static int RecUsayilar(int taban, int us){
        int deger = 1; 
        
        if (us == 0){
            deger = 1;
            return deger;
        }else{
            deger *=taban;
        }
        us--;
        return deger * RecUsayilar(taban, us);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Recursive fonksiyonlar ile üslü sayı hesaplama");
        System.out.print("Taban sayıyı giriniz : ");
        int tabanSayi = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int usDegeri = input.nextInt();
        
        System.out.println("İşlem sonucu : " + RecUsayilar(tabanSayi,usDegeri));
        
        input.close();
    }
}
