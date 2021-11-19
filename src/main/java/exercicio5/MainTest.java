package exercicio5;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        AptTruck comparator = new AptTruck();
        List<Truck> trucks = Control.generateTrucks();
        trucks.sort(comparator);
        System.out.println(Truck.getTruckMoreApt((ArrayList<Truck>) trucks));
    }
}