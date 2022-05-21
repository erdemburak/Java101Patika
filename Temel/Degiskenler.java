package Temel;
public class Degiskenler {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo;
        numberTwo = 20;
        int numberThree = 30, numberFour;
        numberFour = 40;
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree + numberFour);

        int kisaKenar = 10, uzunKenar = 20;
        int alan = kisaKenar * uzunKenar;
        int cevre = 2 * (kisaKenar+uzunKenar);
        System.out.println(alan);
        System.out.println(cevre);
    }
}
