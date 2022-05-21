package Kosulifadeleri;
import java.util.Scanner;
public class UcakBiletiFiyat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, tip;

        System.out.println("--- Uçuş Fiyatı Hesaplama ---");
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipinizi giriniz (1 => Tek Yön, 2 => Gidiş dönüş) : ");
        tip = input.nextInt();
        
        double tutar = 0, yindir=0, tindir, sonTutar;

        if (km >0){
            tutar = km * 0.1;

            if (yas < 12){
                yindir = tutar * 0.5;
                tutar -= yindir;
            }else if(yas < 24){
                yindir = tutar * 0.1;
                tutar -= yindir;
            }else if (yas > 65){
                yindir = tutar * 0.3;
                tutar -= yindir;
            }

            if (tip == 1){
                sonTutar = tutar;
                System.out.println("Toplam tutar = " + sonTutar + " TL");
            }else if(tip == 2){
                tindir = tutar * 0.2 ;
                sonTutar = (tutar - tindir) * 2 ;
                System.out.println("Gidiş Dönüş bilet Tutarı = " + sonTutar + " TL");
            }else{
                System.out.println("Hatalı veri girdiniz!");
            }

        }else {
            System.out.println("Hatalı veri girdiniz!");
        }
        
        input.close();
    }
}
