import java.util.Scanner;

public class zad6 {
    public static void main(String[] arg) {
        Scanner scr = new Scanner(System.in);
        int dayNum = scr.nextInt();

        switch (dayNum) {
            case 1:
                System.out.println("The entered day " + dayNum + " is Monday.");
                break;
            case 2:
                System.out.println("The entered day " + dayNum + " is Tuesday.");
                break;
            case 3:
                System.out.println("The entered day " + dayNum + " is Wednesday.");
                break;
            case 4:
                System.out.println("The entered day " + dayNum + " is Thursday.");
                break;
            case 5:
                System.out.println("The entered day " + dayNum + " is Friday.");
                break;
            case 6:
                System.out.println("The entered day " + dayNum + " is Saturday.");
                break;
            case 7:
                System.out.println("The entered day " + dayNum + " is Sunday.");
                break;
            default:
                System.out.println("The entered day is not valid.");
        }
    }
}
