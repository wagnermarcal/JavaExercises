import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pluviometer p1 = new Pluviometer("A", 100);
        Pluviometer p2 = new Pluviometer("B", 200);

        Truck truck = null;
        truck = new Truck("Alfa", Truck.generateLicensePlate());
        truck = new Truck("Beta", Truck.generateLicensePlate());
        truck.pluviometerStock(p1);
        truck.pluviometerStock(p1);
        truck.pluviometerStock(p1);
        System.out.println(Control.getTotalCapacity());

    }
}
