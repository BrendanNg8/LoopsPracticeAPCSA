//Brendan Ng
import java.util.Scanner;
public class Hailstone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial: ");
        int initial = scanner.nextInt();
        int amt = 0;
        for (int i = 200; i <= 1; i--) {
            while (true) {
                if (initial == 4) {
                    break;
                }
                else if (initial % 2 == 0) {
                    initial = (int) initial / 2;
                }
                else {
                    initial = (initial * 3) + 1;
                }
                System.out.println(initial);
                amt++;
            } 
            System.out.println("Amount of processes: "+amt);
        }
        scanner.close();
    }


}
