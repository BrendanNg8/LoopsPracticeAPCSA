import java.util.Scanner;

public class hailstone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 200; i >= 1; i--) {
            while (true) { 
                if (i == 1) {
                    break;
                }
                if (i % 2 == 0) {
                    i /= 2;
                }
                else {
                    i = (i * 3) + 1;
                }
            }
        }
        scanner.close();
    }
}
