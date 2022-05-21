package Temel;
import java.util.Scanner;
public class DikUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kenar1, kenar2, hipo;
        System.out.println("----- Dik üçgende hipotenüs -----");

        System.out.print("1. Kenarı Giriniz : ");
        kenar1 = input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        kenar2 = input.nextInt();

        hipo = Math.sqrt(Math.pow(kenar1, 2)+ Math.pow(kenar2, 2));
        System.out.println("Hipotenüs : " + hipo);
        
        //------------------------------------------------
        
        int kenar3, kenar4, kenar5;
        double alan; 
        System.out.println("----- 3 kenarı bilinen üçgenin alanı -----");

        System.out.print("1. Kenarı Giriniz : ");
        kenar3 = input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        kenar4 = input.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        kenar5 = input.nextInt();

        int cevre = (kenar3 + kenar4 + kenar5) /2;

        alan = Math.sqrt(cevre * (cevre - kenar3) * (cevre - kenar4) * (cevre - kenar5));
        System.out.println("Üçgenin alanı : " +alan);
        input.close();
    }
}
