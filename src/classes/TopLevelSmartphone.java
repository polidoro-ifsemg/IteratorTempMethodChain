package classes;

public class TopLevelSmartphone extends SamsungSmartphone{
    public TopLevelSmartphone(Smartphone superior) {
        setSuperiorDevice(superior);
        this.setNumberOfRam(6);
        this.setName("Top phone");


    }
}
