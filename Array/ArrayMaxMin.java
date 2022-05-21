package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] list = {2, 5, 3, 33, 22, 42, 2, 8, 16};

        System.out.println(Arrays.toString(list));

        int enb = list[0];
        int enk = list[0];
        for (int i=0 ; i<list.length ; i++){
            if(list[i]>enb){
                enb=list[i];
            }else if(list[i]<enk){
                enk=list[i];
            }
        }

        System.out.println("Dizinin en büyük elemanı : " + enb);
        System.out.println("Dizinin en küçük elemanı : " + enk);

        System.out.println("================================");
        Scanner input = new Scanner(System.in);

        int[] list2 = {15,12,788,1,-1,-778,2,0};
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        int enyb = 0, enyk = 0;

        Arrays.sort(list2);
        for(int i = 0; i<list2.length ; i++){
            if(list2[i]>sayi){
                enyk = list2[i-1];
                enyb = list2[i];
                break;
            }
        }
        System.out.println("Girilen sayı : " + sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + enyk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + enyb);



        input.close();
    }
}
