package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi Boyutunu giriniz : ");
        int boyut = input.nextInt();
        int[] list = new int[boyut];
        
        int value; 
        for(int i=0;i<list.length;i++){
            System.out.print((i+1)+ ". Elemanı giriniz : ");
            value = input.nextInt();
            list[i] = value;
        }

        System.out.println(Arrays.toString(list));
        System.out.println("=======================");
        //Sıralama
        System.out.println("Küçükten Büyüğe sıralanmış hali");
        int tempValue=0;

        for(int i = 0; i<list.length; i++){
            for(int j =0; j<list.length ; j++){
                if(list[i]<list[j]){
                    tempValue = list[j];
                    list[j]=list[i];
                    list[i]=tempValue;
                }
            }
        }

        System.out.println("Sıralama : " + Arrays.toString(list));
        
        
        input.close();
    }
}
