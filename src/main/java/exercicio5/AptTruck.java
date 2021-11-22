package exercicio5;

import java.util.Comparator;

public class AptTruck implements Comparator<Truck> {

    @Override
    public int compare(Truck o1, Truck o2) {
        return Integer.compare(o2.getTotalCapacity(), o1.getTotalCapacity());
    }
}
