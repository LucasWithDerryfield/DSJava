import java.util.Scanner;
import mow.Yard;
import mow.Mower;

public class UserDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Ask the user for details
        System.out.print("What is the height: ");
        int height = scan.nextInt();
        System.out.print("What is the width: ");
        int width = scan.nextInt();

        Yard yard = new Yard(width, height);

        Mower mower = new Mower(0, 0, 0);
        mower.randomizeMower(yard);
        //continue until entire lawn is mowed
        while (mower.updateMower(yard)) {
            clearScreen();
            yard.printLawn(mower);
            delay(500);
        }
        clearScreen();
        yard.printLawn(null);
        scan.close();
    }
    //cleanup and error catching
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void delay(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
    }
}
}