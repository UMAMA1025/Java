package PDF1;
import java.util.Scanner;
public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of gitls in class");
        int girls = sc.nextInt();
        System.out.println("Enter number of boys in class");
        int boys = sc.nextInt();
        sc.close();

        int total = boys + girls;

        double gPercentage = ((double) girls / total ) * 100;
        double bPercentage = ((double) boys / total ) *  100;

        System.out.println("The Total students in class are " + total);
        System.out.println("The percentage of girls in class is : " + String.format("%.3f", gPercentage) + "%" );
        System.out.println("The percentage of boys in class is : " + String.format("%.3f", bPercentage) + "%");

    }
    
}
