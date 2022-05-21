package Array;

public class Arrays {

    static void printArray(int[] ary){
        for(int i = 0 ; i<ary.length ; i++){
            System.out.print(ary[i]+ " ");
        }
    }
    //overload print işlemi
    static void printArray(double[] ary){
        for(int i = 0 ; i<ary.length ; i++){
            System.out.print(ary[i]+ " ");
        }
    }

    static int[] reverseArray (int[] ary){
        int[] reverse = new int[ary.length];
        for(int i = 0, j=ary.length - 1 ; i< ary.length ; i++ , j--){
            reverse [i] = ary[j];
        }
        return reverse;
    }

    static void reverseDeneme (int[] ary, int[] ary2){
        int k=0;
        for(int i = ary.length- 1 ; i>=0;i--){
            ary2[k] = ary[i];
            k++; 
        }
        printArray(ary2);
    }



    public static void main(String[] args) {
        int[] list = new int[10];
        for(int i = 0 ; i< list.length ; i++){
            list[i] = (i+1)*10;
        }
        printArray(list);
        System.out.println();

        int[] list2 = {0,1,2,3,4,5,6,7,8,9};
        for(int i =0; i<list2.length ; i++){
        }
        printArray(list2);
        System.out.println();

        double[] list3 = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6};
        printArray(list3);
        System.out.println();

        //Liste elemanlarını tersten yazdırma
        
        int[] list4 = {1,2,3,4,5};
        int[] list5 = reverseArray(list4);
        printArray(list5);

        System.out.println();
        int[] list6 = {10,20,30,40,50,60,70,80,90};
        int[] list7 = new int[9];
        reverseDeneme(list6, list7);

    }
}
