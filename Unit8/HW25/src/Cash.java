import java.util.ArrayList;

public class Cash {
    private ArrayList<Double> items;
    private double total;

    /*
     * Constructor.
     */
    public Cash() {
        items = new ArrayList<>();
        total = 0.0;
    }

    /*
     * Add the price of an item to the register's total.
     */
    public void addItem(double price) {
        items.add(price);
        total = total + price;
    }

    /*
     * Remove the most recently added item from the current sale.
     */
    public void removeItem() {
            double removedItemPrice = items.remove(items.size() - 1);
            total = total - removedItemPrice;
    }

    /*
     * Return the current total sales amount.
     */
    public double retrieveTotal() {
        return total;
    }

    /*
     * Return the total count of items in the current sale.
     */
    public int getCount() {
        return items.size();
    }

    /*
     * Clear the register (total and count) for a new sale.
     */
    public void clear() {
        items.clear();
        total = 0.0;
    }
}