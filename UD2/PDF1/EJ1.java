package UD2.PDF1;
import java.util.Scanner;
public class EJ1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inout your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.close();
        System.out.println("Hola " + name + ", tienes " + age + " años." );

    }
}