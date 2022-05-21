package Donguler;

public class While {
    public static void main(String[] args) {
        int i,k; 
        i=1;
        while (i<=5){
            System.out.print(i + " ");
            k=1;
            while (k<=5){
                System.out.print(k + " " );
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
