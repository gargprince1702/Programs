package daksh;

import java.util.Scanner;

public class Evenodd {
    public static void check() {
        Scanner scanner = new Scanner(System.in);
        // Taking the users input..
        System.out.println("Enter any number-");
        int num = scanner.nextInt();
        if (num%2==0){
            System.out.println("The number "+ num +" is even");
        }else {
            System.out.println("The number " + num +" is odd");
        }


    }
}
