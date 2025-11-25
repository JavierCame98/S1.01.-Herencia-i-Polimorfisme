package S1012;

public class Main {
    public static void main(String[] args) {


        System.out.println("Demonstration of the difference of the three attributes");

        System.out.println("1.Static final");
        System.out.println(Car.getBrand());

        System.out.println("2.Static");
        System.out.println(Car.getModel());
        Car.setModel("X5");
        System.out.println(Car.getModel());

        System.out.println("3.Final");
        Car c1 = new Car("BMW","X5",2500);
        System.out.println(c1.getPower());


        System.out.println("Demonstration of the initialization of the static method");

        Car.toCurb();

        System.out.println("Demonstration of the initialization of the non static method");

        c1.toAccelerate();

    }
}
