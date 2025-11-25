package S102;

public abstract class Phone {

    private String brand;
    private String model;

    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String toCall(String phoneNumber){
        return "You are calling to " + phoneNumber;
    }
}
