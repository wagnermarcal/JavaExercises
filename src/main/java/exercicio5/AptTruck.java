package exercicio5;

import java.util.Comparator;

public class AptTruck implements Comparator<Truck> {

    @Override
    public int compare(Truck o1, Truck o2) {
        if (o1.getTotalCapacity() > o2.getTotalCapacity()) {
            return -1;
        }
        if (o1.getTotalCapacity() < o2.getTotalCapacity()) {
            return 1;
        }
        return 0;
    }
}
