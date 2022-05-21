package Kosulifadeleri;
public class CharBoolean{
    public static void main(String[] args) {
        
        //Char veri tipi tek bir karakteri değer olarak tutar ve ascii kodlarındaki değerlere göre de çıktı verir 
        char vChar = 'b';
        char v2Char = 98;
        
        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'V';
        char c4 = 'A';

        System.out.println(vChar);
        System.out.println(v2Char);
        
        System.out.println("" + c1+c2+c3+c4);

        boolean dogru = true;
        boolean yanlis = false; 
        System.out.println(dogru);
        System.out.println(yanlis);

        byte b = 0; 
        int a = b++;
        System.out.println(a);

        int m = -12;
        int n = -5;
        int sonuc = m%n;
        System.out.println(sonuc);

    }
}