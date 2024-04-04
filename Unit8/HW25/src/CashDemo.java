import java.util.Scanner;

public class CashDemo {
    public static void main(String[] args) {
        Cash Register = new Cash();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number to add to price and item totals");
            System.out.println("Enter 't' to show totals");
            System.out.println("Enter 'd' to wipe the last item");
            System.out.println("Enter 'c' to clear the register");
            System.out.println("Enter 'q' to exit:");

            String input = scan.next();

            if (input.equals("t")) {
                //print current totals
                System.out.println("Current Sales: " + Register.retrieveTotal());
                System.out.println("Current Items: " + Register.getCount());
            } else if (input.equals("d")) {
                //clear most recent item from count and price
                    Register.removeItem();
                    System.out.println("Wiped.");
            } else if (input.equals("c")) {
                //clear the entire register
                Register.clear();
                System.out.println("Cleared.");
            } else if (input.equals("q")) {
                //quit the program
                System.out.println("Executing Quit...");
                break;
            } else {
                //parsedouble to add to price total
                    double price = Double.parseDouble(input);
                    Register.addItem(price);
                    System.out.println(price + " dollars are now included in the sales total.");
                }
            }
        }
}