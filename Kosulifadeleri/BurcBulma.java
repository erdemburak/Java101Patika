package Kosulifadeleri;
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.print("Doğduğunuz Ay : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();

        switch (month){
            case 1:
                if (day >=1 && day <=31){
                    if( day <=21 ){
                        System.out.println("Burcunuz : Oğlak");
                    }else  {
                        System.out.println("Burcunuz : Kova");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 2:
                if (day >=1 && day <=28){
                    if( day <=19 ){
                        System.out.println("Burcunuz : Kova");
                    }else  {
                        System.out.println("Burcunuz : Balık");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 3:
                if (day >=1 && day <=31){
                    if( day <=20 ){
                        System.out.println("Burcunuz : Balık");
                    }else  {
                        System.out.println("Burcunuz : Koç");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 4:
                if (day >=1 && day <=30){
                    if( day <=20 ){
                        System.out.println("Burcunuz : Koç");
                    }else  {
                        System.out.println("Burcunuz : Boğa");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 5:
                if (day >=1 && day <=31){
                    if( day <=21 ){
                        System.out.println("Burcunuz : Boğa");
                    }else  {
                        System.out.println("Burcunuz : İkizler");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 6:
                if (day >=1 && day <=30){
                    if( day <=22 ){
                        System.out.println("Burcunuz : İkizler");
                    }else  {
                        System.out.println("Burcunuz : Yengeç");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 7:
                if (day >=1 && day <=31){
                    if( day <=22 ){
                        System.out.println("Burcunuz : Yengeç");
                    }else  {
                        System.out.println("Burcunuz : Aslan");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 8:
                if (day >=1 && day <=31){
                    if( day <=22 ){
                        System.out.println("Burcunuz : Aslan ");
                    }else  {
                        System.out.println("Burcunuz : Başak");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 9:
                if (day >=1 && day <=30){
                    if( day <=22 ){
                        System.out.println("Burcunuz : Başak ");
                    }else  {
                        System.out.println("Burcunuz : Terazi");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 10:
                if (day >=1 && day <=31){
                    if( day <=22 ){
                        System.out.println("Burcunuz : Terazi");
                    }else  {
                        System.out.println("Burcunuz : Akrep");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 11:
                if (day >=1 && day <=30){
                    if( day <=22 ){
                        System.out.println("Burcunuz : Akrep");
                    }else  {
                        System.out.println("Burcunuz : Yay");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
            case 12:
                if (day >=1 && day <=31){
                    if( day <=22 ){
                        System.out.println("Burcunuz : Yay");
                    }else  {
                        System.out.println("Burcunuz : Oğlak");
                    }
                }else {
                    System.out.println("Hatalı gün girdiniz.");
                }
                break;
        }
        
        input.close();
    }
}
