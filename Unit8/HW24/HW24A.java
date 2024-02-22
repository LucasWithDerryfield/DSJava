import java.util.Scanner;

public class HW24A {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("What is your name: ");
        String n = in.nextLine();
        System.out.print("What is your age: ");
        int a = in.nextInt();
        System.out.println("Name: " + n);
        System.out.println("Age" + a);
    }
}