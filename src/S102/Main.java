package S102;

public class Main {
    static void main(String[] args) {


        System.out.println("Creating a SmartPhone object");
        SmartPhone s = new SmartPhone("IPhone", "16");

        System.out.println("------------------");
        System.out.println("Calling two methods");

        s.toAlarm();
        s.toPhotograph();
    }
}
