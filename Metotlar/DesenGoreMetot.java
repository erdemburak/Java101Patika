package Metotlar;

import java.util.Scanner;

public class DesenGoreMetot {
    static int desenMetot(int sayi,int tempSayi,int turn){
        if(turn == 1){
            System.out.print(tempSayi + " ");
            tempSayi-=5;
            if(tempSayi<=0){
                turn =0;
            }
        }else{
            System.out.print(tempSayi + " ");
            tempSayi+=5;
            if(tempSayi==sayi){
                return sayi;
            }
        }
        return desenMetot(sayi, tempSayi, turn);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DESENE GÖRE METOT OLUŞTURMA RECURSİVE");
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        int tempSayi = sayi;
        int turn = 1;
        System.out.print("Çıktısı : ");
        System.out.print(desenMetot(sayi,tempSayi, turn));
        
        input.close();
    }
}
