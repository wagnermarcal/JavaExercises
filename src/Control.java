import java.util.ArrayList;
import java.util.Scanner;

public class Control {

    private static final Scanner scan = new Scanner(System.in);

    public static String readString() {
        return scan.nextLine();
    }

    public static int readInteger() {
        return scan.nextInt();
    }

    public static int getTotalCapacity() {
        int total = 0;
        for (Pluviometer p : Truck.pluviometers) {
            total += p.getVolumePluv();
        }
        return total;
    }

}
