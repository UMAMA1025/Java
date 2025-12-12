package PDF1;

import java.util.Scanner;
public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = sc.nextLine();
        System.out.println("Enter second word");
        String word2 = sc.nextLine();
        System.out.println("Enter third word");
        String word3 = sc.nextLine();
        sc.close();
        String suma = word1 + word2 + word3;

        System.out.println("The length of these 3 words is " + suma.length() + " characters.");

    }
}
