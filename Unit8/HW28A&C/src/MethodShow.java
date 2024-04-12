public class MethodShow {
    public static void main(String[] args) {
        //PI is a static value
        int radius = 8;
        double area = Math.PI * Math.pow(radius, 2); //calculate area
        System.out.println("Cirle Area: " + area);

        //Math.pow is a static method
        int exponent = 2;
        int base = 5;
        double finl = Math.pow(base, exponent);
        System.out.println("Final answer after power: " + finl);
    }
}