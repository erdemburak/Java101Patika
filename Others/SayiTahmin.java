package Others;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected; 

        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);
        while(right<5){
            System.out.print("Tahmininizi giriniz : ");
            selected = input.nextInt();
            if(selected<0 || selected>99){
                System.out.println("0-100 arasında bir değer giriniz.");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + (5-right));
                }else{
                    isWrong =true;
                    System.out.println("Sonraki hatalı girişinizde hakkınız azalacaktır. ");
                }
                continue;
            }
            
            if(selected == number){
                System.out.println("Tebrikler, doğru tahmin : " + number);
                isWin = true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz!");
                if(selected<number){
                    System.out.println(selected + "'den daha büyük bir sayı giriniz.");
                }else if(selected>number){
                    System.out.println(selected+ "'den daha küçük bir sayı giriniz.");
                }

                wrong[right]= selected;
                right++;
                System.out.println("Kalan hakkınız : " + (5- right));
            }
        }

        if(!isWin){
            System.out.println("Kaybettiniz!");
            if(!isWrong){
                System.out.println(Arrays.toString(wrong));
            }
        }

        
        input.close();
    }
}
