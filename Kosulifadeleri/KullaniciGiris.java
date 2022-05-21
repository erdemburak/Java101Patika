package Kosulifadeleri;
import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, Password;
        System.out.println("--- Kayıt Ol ---");
        System.out.print("Kullanici Adi Giriniz : ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifre Giriniz : ");
        Password = input.nextLine();
        
        String user, pass;
        System.out.println("--- Giriş Yap ---");
        System.out.print("Kullanici Adi Giriniz : ");
        user = input.nextLine();
        System.out.print("Şifre Giriniz : ");
        pass = input.nextLine();

        if  (kullaniciAdi.equals(user)){
            if (Password.equals(pass)){
                System.out.println("Giriş Başarılı");
            }else{
                System.out.println("Hatalı Giriş");
            }
        }else{
            System.out.println("Hatalı Giriş");
        }
        
        System.out.print("Yeni Şifre oluşturmak için 1 çıkmak için 2 tuşlayın : ");
        int change = input.nextInt();
        if (change == 1){
            System.out.print("Yeni şifre girin : ");
            String nSifre = input.nextLine();
            if (nSifre.equals(pass)){
                System.out.println("Sifre oluşturulamadı lütfen başka bir şifre giriniz.");
            }else {
                System.out.println("Şifre oluşturuldu.");
            }                    
        }else{
            System.out.println("Sonlandırıldı");
        }

        
        input.close();
    }
}
