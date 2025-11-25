package S1011;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, int price){
        super(name, price);
    }


    @Override
    public void play(){
        System.out.println("A string instrument is playing");
    }
}
