package S1011;

public abstract class Instrument {

    private String name;
    private int price;
    public static int instrumentCounter = 0;

    static {
        System.out.println("Instrument class has been initialized");
    }

    public Instrument (String name, int price){
        this.name = name;
        this.price = price;

       //instrumentCounter++;
       System.out.println("Instrument object has been initialized");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public abstract void play();
}
