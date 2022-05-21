package Donguler;

public class ContinueBreak {
    public static void main(String[] args) {
        int a;
        for(a=1 ; a<=10 ; a++){
            if(a == 5){
                continue;
            }
            System.out.print(a + " ");
        }
        System.out.println();
        for(a=1 ; a<=10 ; a++){
            if(a == 5){
                break;
            }
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Tek sayıların ekrana yazılması");
        
        int t=0;
        while(t<10){
            t++;
            if(t%2==0){
                continue;
            }
            System.out.println(t + " ");
        }


        int b=0;
        for(b=1; b<=6;b++)
        {
            if(b%3==0)
            continue;
            System.out.print(b+",");
        }
        System.out.println();

        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                    System.out.print(i + j);
            }
        }
    }
}