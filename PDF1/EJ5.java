package PDF1;
import java.util.Scanner;
public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = sc.nextInt();
        System.out.println("Enter a number");
        int number2 = sc.nextInt();
        System.out.println("Enter a number");
        int number3 = sc.nextInt();
        sc.close();

        int total = number1 + number2 + number3;
        double avg = total /3.0;

        System.out.println("The avg of these 3 numbers is " + avg);
    }
}
