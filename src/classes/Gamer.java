package classes;

import java.util.ArrayList;
import java.util.List;

public class Gamer {

    public static List<String> gamerDevices(SmartphoneIterator iterator) {
        ArrayList smarts =  new ArrayList<String>();
        for (Smartphone smart : iterator) {
            if (smart.isHasGraphicCard()) {
                smarts.add(smart.getName());
            }
        }
        return smarts;
    }

    public static Integer countGamerDevices(SmartphoneIterator iterator) {
        Integer count = 0;
        for (Smartphone smart : iterator) {
            if (smart.isHasGraphicCard()) {
                count++;
            }
        }
        return count;
    }
}
