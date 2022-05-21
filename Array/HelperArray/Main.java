package Array.HelperArray;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        int[] list2 = {5,2,4,6,3,3,52,22};
        
        HelperArray.print(list);

        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.toString(list2));


        HelperArray.arraysAvarage(list2);
        HelperArray.arraysAvarage(list);

    }
}
