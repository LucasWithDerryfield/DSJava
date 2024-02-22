import HW24.*;
import java.util.Scanner;

public class HW24B {
    public static void main(String[] args) {
        int cake = 0;
        int pie = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your preference, cake or pie. 'c' is cake and 'p' is pie. 'q' to quit:");
            String inputer = scan.nextLine();
            if (inputer.equals("p")) {
                pie++;
            } else if (inputer.equals("c")) {
                cake++;
            } else if (inputer.equals("q")) {
                break;
            } else {
                System.out.println("Input unrecognized. Try again.");
            }
        }
        System.out.println("Cake votes: " + cake);
        System.out.println("Pie votes: " + pie);
    }
}