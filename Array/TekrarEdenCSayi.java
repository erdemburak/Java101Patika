package Array;

import java.util.Arrays;

public class TekrarEdenCSayi {
    static boolean isFind(int[] ary, int value){
        for(int i: ary){
            if (i ==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2,4,6,3,2,1,3,2,34,21,5,46,2,12,6};
        int[] dublicate = new int[list.length];
        int index = 0; 
        for(int i = 0; i<list.length; i++){
            for(int j = 0; j<list.length;j++){
                if(list[i]%2==0){
                    if((i!=j) && (list[i] == list[j])){
                        if(!isFind(dublicate, list[i])){
                            dublicate[index++] = list[i];
                        }
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(dublicate));

    }
}