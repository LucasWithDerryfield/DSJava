public class Bicycle {
    private int speed; //
    private final int MAX_SPEED = 30;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void pedal() {
        // increase the virtual speed of the bicycle.
        speed = speed + 1;
        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
        }
    }

    public void brake() {
        speed = speed - 1;
        if (speed < 0) {
            speed = 0;
        }
    }
}

class GearedBicycle {
    private int speed; //
    private final int MAX_SPEED = 30;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void pedal() {
        // increase the virtual speed of the bicycle.
        speed = speed + 1;
        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
        }
    }

    public void brake() {
        //this class, in order to model a geared bicycle with twice the braking power, has been provided with a braking value of "2" instead of "1".
        speed = speed - 2;
        if (speed < 0) {
            speed = 0;
        }
    }
}

class BikeDemo {
    public static void main(String[] args) {
        Bicycle regularBicycle = new Bicycle();
        GearedBicycle gearedBicycle = new GearedBicycle();

        //increase Speed
        for (int i = 0; i < 50; i++) {
            regularBicycle.pedal();
            gearedBicycle.pedal();
        }

        //check speed
        System.out.println("Regular Bicycle Brake: " + regularBicycle.getSpeed());
        System.out.println("Geared Bicycle Brake: " + gearedBicycle.getSpeed());

        //brake
        for (int i = 0; i < 5; i++) {
            regularBicycle.brake();
            gearedBicycle.brake();
        }
        
        //check speed
        System.out.println("Regular Bicycle Brake: " + regularBicycle.getSpeed());
        System.out.println("Geared Bicycle Brake: " + gearedBicycle.getSpeed());
    }
}