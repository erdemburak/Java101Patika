package Temel;
import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yariCap;
        double alan, cevre, pi = 3.14;
        System.out.print("Yarıçapı giriniz : ");
        yariCap = input.nextInt();

        alan = pi * Math.pow(yariCap, 2);
        cevre = 2 * pi * yariCap;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        
        System.out.println("-------- x açılı daire diliminin alanı --------");

        int yariCap2, alfa;
        System.out.print("Yarıçapı giriniz : ");
        yariCap2 = input.nextInt();
        System.out.print("Açıyı giriniz : ");
        alfa = input.nextInt();
        double alan2;
        alan2 = (pi * Math.pow(yariCap2, 2) * alfa) / 360;
        System.out.println("Daire diliminin alanı : " +alan2);
        

        input.close();
    }

}
