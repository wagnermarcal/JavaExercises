package exercicio5;

import java.io.Serializable;
import java.util.Comparator;

/**
 * This class is responsible for comparing the trucks and returning the truck that carries the highest capacity in pluviometers.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class AptTruck implements Comparator<Truck>, Serializable {

    @Override
    public int compare(Truck o1, Truck o2) {
        return Integer.compare(o2.getTotalCapacity(), o1.getTotalCapacity());
    }
}
