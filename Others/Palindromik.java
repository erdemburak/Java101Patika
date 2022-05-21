package Others;

import java.util.Scanner;

public class Palindromik {
    static boolean isPalindromik(String str){
        int i = 0; 
        int j = (str.length() - 1);
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindromik2(String str){
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String str = input.nextLine();

        if(isPalindromik(str)){
            System.out.println("Girdiğiniz kelime Palindromik Kelimedir.");
        }else{
            System.out.println("Girdiğiniz kelime Palindromik Kelime değildir.");
        }
        
        input.close();
    }
}
