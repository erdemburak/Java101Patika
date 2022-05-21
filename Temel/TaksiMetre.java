package Temel;
import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {
        double km, tutar = 10, ucret;
        Scanner girdi = new Scanner(System.in);

        System.out.println("----- Taksimetre -----");
        System.out.print("Km giriniz : ");
        km = girdi.nextDouble();

        tutar += km * 2.2;
        ucret = tutar <= 20 ? 20 : tutar;
        System.out.println("Taksi ücreti : " +ucret);

        girdi.close();
    }
}