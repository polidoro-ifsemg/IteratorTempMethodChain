package classes;

public class EntryLevelSmartphone extends SamsungSmartphone{

    public EntryLevelSmartphone(Smartphone superior) {
        setSuperiorDevice(superior);
        this.setNumberOfRam(2);
        this.setName("Low level phone");

    }

}
