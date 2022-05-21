package Kosulifadeleri;
import java.util.Scanner;
public class HavaDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int havad;
        System.out.print("Hava sıcaklığını giriniz : ");
        havad = input.nextInt();

        if ( havad < 5 ){
            System.out.println("Kayak Yapabilirsiniz.");
        }else if ( havad <= 25 ){
            if (havad < 10){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }else if (havad < 15){
                System.out.println("Sinema ya da Pikniğe Gidebilirsiniz.");
            }else {
                System.out.println("Pikniğe Gidebilirsiniz.");
            }
        }else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
        
        input.close();
    }
    
}
