import java.util.Scanner;

public class zad1 {
    public static void main(String[] arg){
        System.out.println("Please enter two int numbers: ");

        Scanner scr = new Scanner(System.in);
        int firstNum = scr.nextInt(); //def first num
        System.out.println("First number is: " + firstNum);

        int secondNum = scr.nextInt(); //def second num
        System.out.println("Second num is: " + secondNum);

        System.out.println("Please enter third int number: ");

        int thirdNum = scr.nextInt(); //def third num

        if (thirdNum > firstNum && thirdNum < secondNum ||
            thirdNum < firstNum && thirdNum > secondNum) {

            System.out.println("The third number " + thirdNum + " is between " + firstNum + " and " + secondNum);
        }
        else {
            System.out.println("The third number" + thirdNum + "2 is not between " + firstNum + " and " + secondNum);
        }
    }
}
