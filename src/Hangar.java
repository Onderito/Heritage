public class Hangar {

    public static void main(String[] args) {
        Car car = new Car ("Mercedes", 1000);
        Boat boat = new Boat("Yamaha", 300000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
