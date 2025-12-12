package UD2.PDF1;
import java.util.Scanner;
public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first cualification (30%): ") ;
        int cal1 = sc.nextInt();

        System.out.println("Enter second cualification (20%): ") ;
        int cal2 = sc.nextInt();

        System.out.println("Enter third cualification (50%): ") ;
        int cal3 = sc.nextInt();
        sc.close();

        double avgWight = cal1 * 0.3 + cal2 * 0.2 + cal3 * 0.5;
        System.out.println("The sum ag of this student is " + avgWight);
        }
}
