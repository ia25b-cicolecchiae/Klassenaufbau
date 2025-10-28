package exercise3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("zh420", 600, 3000, 0.056, 450);
        Car car2 = new Car("zh420", 700, 3200000, 0.096, 490);
        Car car3 = new Car();

        car1.drive(200);
        car2.drive(400);
        car1.refuel(220);
        car2.refuel(320);

        System.out.println(car1);
        System.out.println(car2);


    }
}
