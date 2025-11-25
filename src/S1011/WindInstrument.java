package S1011;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, int price){
        super(name, price);
    }

    @Override
    public void play(){
        System.out.println("A wind instrument is playing");
    }


}
