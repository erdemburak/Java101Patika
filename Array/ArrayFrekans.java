package Array;

import java.util.Arrays;

public class ArrayFrekans {
    static boolean isFind(int[] ary, int value){
        for(int i: ary){
            if (i ==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int[] list = {10,20,20,10,10,20,5,20};
        System.out.println(Arrays.toString(list));

        System.out.println("Tekrar Sayıları");
        int index = 0; 
        int repeat= 1;
        for(int i = 0; i<list.length; i++){
            for(int j = 0; j<list.length;j++){
                if((i!=j) && (list[i] == list[j])){
                    repeat++;
                    index = list[i]; 
                    list[j]=0;
                }
            }
            if(index!=0){
                System.out.println(index +" Sayısı " + repeat+ " kere tekrar edildi.");
                repeat = 1;
            }
            
        }

    }
}