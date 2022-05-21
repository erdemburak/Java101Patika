package Temel;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, dmt = 1.11, muz = 0.95, ptc = 5.00, tutar;
        double armutt, elmat, dmtt, muzt, ptct;
        System.out.println("------ Almak istediğiniz ürünlerin kg birimlerini giriniz ------");
        System.out.print("Armut kaç kilo? : ");
        armutt = girdi.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        elmat = girdi.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        dmtt = girdi.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        muzt = girdi.nextDouble();
        System.out.print("Patlıcan kaç kilo? : ");
        ptct = girdi.nextDouble();

        armutt *= armut;
        elmat *= elma;
        dmtt *= dmt;
        muzt *= muz;
        ptct *= ptc;

        tutar = armutt + elmat + dmtt + muzt + ptct;
        
        System.out.print("Toplam tutar : " +tutar + " TL");
        girdi.close();
    }
}
