import java.util.ArrayList;

public class PartCD {
    public static void main(String[] args) {
        /*
         * The output of the code in part C is:
         * 150
         * 150
         * This is due to both variables being refrences to the same object.
         * Therefore any changes made to one, are made to both.
         * This results in the same result being returned twice.
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Initial: " + list);
        swap(list, 0, 1);
        System.out.println("Tampered: " + list);
    }
    
    public static void swap(ArrayList<Integer> list, int i, int j) {
        if (i < 0 || i >= list.size() || j < 0 || j >= list.size()) {
            System.out.println("Please enter valid values.");
            return;
        } else{
        Integer first = list.get(i);
        list.set(i, list.get(j));
        list.set(j, first);
        }
    }
}