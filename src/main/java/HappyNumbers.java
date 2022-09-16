import java.util.InputMismatchException;
import java.util.Scanner;

public class HappyNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");

        while(true) {

            try {
                int n = s.nextInt();

                if(n > 0) {
                    System.out.printf("%d is %s%n", n, MathUtils.isHappy(n) ? "happy" : "unhappy");
                    break;
                }

                System.out.println("Please enter a POSITIVE integer...");

            } catch (InputMismatchException e){
                System.out.println("That is not an integer...");
                s.next();
            }
        }

        System.out.println("Goodbye");

        System.exit(0);

    }

}
