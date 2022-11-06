public class zad7 {
    public static void main(String[] arg) {

        for (int i = 1; i <= 100; i++) {
            if (i >= 54 && i <= 74) {
                continue;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
