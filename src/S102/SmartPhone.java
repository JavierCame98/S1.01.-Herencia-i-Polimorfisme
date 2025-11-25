package S102;

public class SmartPhone extends Phone implements Camera, Clock{

    public SmartPhone(String brand, String model){
        super(brand, model);
    }

    @Override
    public void toPhotograph(){
        System.out.println("A photo is being taken");
    }

    @Override
    public void toAlarm(){
        System.out.println("The alarm is ringing");
    }

}
