package Array;

public class TekBoyutArray {
    public static void main(String[] args) {
        double[] list = new double[5];
        list[0] = 4.1;
        System.out.println(list[0]);

        String[] days = {"Pazartesi" , "Salı" , "Çarşamba" , "Perşembe" , "Cuma"};
        String[] weekendDays = new String[] {"Cumartesi" , "Pazar"};
        weekendDays[0] = "Pazar" ; 
        System.out.println(weekendDays[0]);
        System.out.println(days.length);
        
    }
}
