package Array;

import java.util.Arrays;

public class AvarageArray {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        double toplam = 0;
        double avarage = 0;
        
        for(int i = 0; i<list.length;i++){
            toplam +=list[i];
        }
        avarage = toplam / list.length;
        System.out.println(Arrays.toString(list));
        System.out.println("Dizinin ortalaması : " + avarage);
        
    }
}
