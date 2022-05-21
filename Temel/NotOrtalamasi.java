package Temel;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fiz, tr;
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fiz = input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz : ");
        tr = input.nextInt();

        double toplam = mat + fiz +tr ;
        double ort = toplam/3;
        String durum = ort>=60 ? "Geçti" : "Kaldı";
        System.out.print("Not ortalamanız :" +ort +" ------ " + durum);
        
        input.close();
    }
}
