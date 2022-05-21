package Array.HelperArray;

public class HelperArray {
    static void print(int[] ary){
        System.out.print("[");
        for(int i = 0; i<ary.length; i++){
            System.out.print(ary[i]+ " ");
        }
        System.out.println("]");
    }
    static int[] fill (int[] ary, int value){
        for(int i =0; i<ary.length;i++){
            ary[i]=value;
        }
        return ary;
    }


    static double arraysAvarage(int[] list){
        double toplam = 0;
        double avarage = 0;
        
        for(int i = 0; i<list.length;i++){
            toplam +=list[i];
        }
        avarage = toplam / list.length;
        System.out.println("Dizinin ortalaması : " + avarage);
        
        return avarage;
    }
}
