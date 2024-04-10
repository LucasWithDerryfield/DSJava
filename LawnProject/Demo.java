import mow.Yard;
import mow.Mower;

public class Demo {
    public static void main(String[] args) {
        clearScreen();

        int height = 5;
        int width = 20;

        Yard yard = new Yard(width + 2, height + 2);
        Mower mower = new Mower(1, 1, 1);
        mower.randomizeMower(yard);

        while (mower.updateMower(yard)) {
            yard.printLawn(mower);
            delay(500);
            clearScreen();
        }

        yard.printLawn(mower);
    }

    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}