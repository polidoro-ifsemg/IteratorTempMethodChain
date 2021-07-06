package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SmartphoneIterator implements Iterable<Smartphone>{

        private List<Smartphone> smartphones = new ArrayList<>();

        public SmartphoneIterator(Smartphone... smartphones) {
            this.smartphones = Arrays.asList(smartphones);
        }

        @Override
        public Iterator<Smartphone> iterator() {
            return smartphones.iterator();
        }
}
