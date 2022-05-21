package Kosulifadeleri;
import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fizik, kimya, geo, turkce, tarih, sonuc;
        System.out.println("--- Sınav Puanlarınızı Giriniz ---");
        System.out.print("Matematik : ");
        mat = input.nextInt();
        System.out.print("Fizik : ");
        fizik = input.nextInt();
        System.out.print("Kimya : ");
        kimya = input.nextInt();
        System.out.print("Geometri : ");
        geo = input.nextInt();
        System.out.print("Türkçe : ");
        turkce = input.nextInt();
        System.out.print("Tarih : ");
        tarih = input.nextInt();

        sonuc = (mat + fizik + kimya + geo + turkce + tarih) / 6;
        System.out.print("Not Ortalaması : "+ sonuc);
        
        if (sonuc >= 0 && sonuc < 55){
            System.out.println(" Geçemedi");
        }else if (sonuc >= 55 && sonuc < 100){
            System.out.println(" Geçti");
        }else {
            System.out.println(" Hatalı işlem");
        }
        
        
        input.close();
    }  
}
