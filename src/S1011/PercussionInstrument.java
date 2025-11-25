package S1011;


public class PercussionInstrument extends Instrument {

    public PercussionInstrument(String name, int price){
        super(name, price);
    }


    @Override
    public void play(){
        System.out.println("A percussion instrument is playing");
    }
}
