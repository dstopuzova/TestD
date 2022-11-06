import java.util.Scanner;

public class zad3 {
    public static void main(String[] arg){

        Scanner scr = new Scanner(System.in);
        int firstNum = scr.nextInt(); //def first num
        int secondNum = scr.nextInt(); //def second num
        int thirdNum = scr.nextInt(); //def third num

        int firstValue = firstNum; //def var to save value of the first num

        firstNum = secondNum;
        System.out.println("First number is: " + firstNum);

        secondNum = thirdNum;
        System.out.println("Second number is: " + secondNum);

        thirdNum = firstValue;
        System.out.println("Third number is: " + thirdNum);

        int sum = (firstNum + secondNum); //def sum of 1 & 2
        System.out.println("The sum of first & second number is: " + sum);

        int subtractionSum3 = (sum - thirdNum); //def subtraction of the sum and third num
        System.out.println("The subtraction of the sum and third number is: " + subtractionSum3);

    }
}
