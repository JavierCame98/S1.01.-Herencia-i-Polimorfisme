package S1012;

public class Car {

    private static final String brand = "BMW";
    private static String model;
    private final int power;

    public Car(String brand, String model, int power){
        this.power = power;
    }

    public static String getBrand(){
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static void toCurb(){
        System.out.println("The car is curbing");
    }

    public void toAccelerate(){
        System.out.println("The car is accelerating");
    }
}
