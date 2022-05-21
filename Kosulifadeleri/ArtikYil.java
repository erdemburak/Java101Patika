package Kosulifadeleri;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil, kDort, kYuz, kDorty;

        System.out.println("--- Artık Yıl Hesap ---");
        System.out.print("Yıl giriniz : ");
        yil = input.nextInt();

        kDort = yil % 4;
        kYuz = yil % 100;
        kDorty = yil % 400;

        if (kDort == 0) {
            if ((kYuz == 0) && (kDorty == 0)){
                System.out.println(yil +" bir artık yıldır.");
            }else if (kYuz != 0){
                System.out.println(yil +" bir artık yıldır.");
            }else{
                System.out.println(yil +" bir artık yıl değildir!");
            }
        }else {
            System.out.println(yil +" bir artık yıl değildir!");
        }

        
        input.close();
    }
}
