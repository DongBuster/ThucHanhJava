package car;

public class TaxiCar implements Car {
    public void Move() {
        System.out.println("Taxi car move");
    }

    public void Stop() {
        System.out.println("Taxi car stop");
    }

    public void TurnRight() {
        System.out.println("Taxi car turn right");
    }

    public void TurnLeft() {
        System.out.println("Taxi car turn left");
    }

    public void Reverse() {
        System.out.println("Taxi car reverse");
    }
}
