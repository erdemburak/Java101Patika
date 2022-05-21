package Donguler;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, password;
        int tryPass = 3, select, bakiye = 0, paraYatır=0, paraCek =0;

        while(tryPass>0){
            System.out.println("---- Bankaya Hoşgeldiniz ----");
            System.out.print("Kullanici Adınızı Giriniz : ");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = input.nextLine();


            if(kullaniciAdi.equals("Elessar") && password.equals("1234")){
                System.out.println("Giriş Başarılı!");
                do{
                    System.out.println("--- Yapmak istediğiniz işlemi seçin ---\n" + 
                                "1 - Para Yatırma\n " + 
                                "2 - Para Çekme\n" + 
                                "3 - Bakiye Sorgulama\n" + 
                                "4 - Çıkış");
                    System.out.print("Seçiminiz : ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            paraYatır = input.nextInt();
                            bakiye += paraYatır;
                            break;
                        case 2: 
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            paraCek = input.nextInt();
                            if (paraCek>bakiye){
                                System.out.println("Yeterli bakiye bulunmuyor!");
                            }else{
                                bakiye -= paraCek;
                            }
                            break;
                        case 3:
                            System.out.println("Hesap bakiyeniz :" + bakiye);
                            break;
                        case 4:
                            System.out.println("Güvenli bir şekilde çıkış yaptınız");
                            break;
                        default:
                            System.out.println("Hatalı giriş yaptınız");
                            break;
                    }
                }while (select!=4);
                break;
            }else{
                tryPass--;
                if(tryPass == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen şubemize başvurunuz");
                }else{
                    System.out.println("Hatalı Kullanıcı adı veya şifre Lütfen tekrar giriş yapınız.");
                    System.out.println(tryPass + " Hakkınız kalmıştır.");
                }
            }
        }

        input.close();
    }
}
