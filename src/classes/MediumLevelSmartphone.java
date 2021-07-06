package classes;

public class MediumLevelSmartphone extends AppleSmartphone{
    public MediumLevelSmartphone(Smartphone superior) {
        setSuperiorDevice(superior);
        this.setNumberOfRam(4);
        this.setName("Medium phone");
    }
}
