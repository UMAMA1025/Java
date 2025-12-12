package PDF1;
import java.util.Scanner;
public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        sc.close();

        int doubl = number * 2;
        int triple = number * 3;
        System.out.println(number + " double is " + doubl + " and Trible is " + triple);
        
    }
}
