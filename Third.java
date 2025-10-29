import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        int target = (int) (Math.random()*101);
        Scanner scanner = new Scanner(System.in);

        System.out.println("What your guess?: ");
        int guess = scanner.nextInt();

        while (true) {
            if (guess == target) {
                System.out.println("You got it");
                break;
            } else if (guess > target) {
                System.out.println("Go lower");
            } else {
                System.out.println("Go higher");
            }
            System.out.println("What your guess?: ");
            guess = scanner.nextInt();
            
        }
        scanner.close();
    }
}
