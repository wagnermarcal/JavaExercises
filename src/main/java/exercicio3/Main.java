package exercicio3;

public class Main {

    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.initialize(20.0, 25); // Definindo a capacidade do elevador e o total de andares.
        System.out.println(elevator.getCurrentElevatorFloor()); // Andar: 0
        System.out.println(elevator.getPersonsInElevator()); // Pessoas: 0
        System.out.println(elevator.getTotalFloors()); // Total andares: 25
        System.out.println(elevator.getGroundFloor()); // Térreo: 0
        System.out.println(elevator.getElevatorCapacity()); // Capacidade do elevador: 20.0
        elevator.enter(10); // Entram 10 pessoas no elevador
        elevator.up(20); // O elevador sobe 20 andares
        elevator.up(4); // O elevador sobe 4 andares
        elevator.up(1); // O elevador sobe 1 andar
        elevator.enter(9); // Entram 9 pessoas no elevador
        elevator.enter(1); // Entra 1 pessoa no elevador
        elevator.leave(2); // Saem 2 pessoas do elevador
        elevator.enter(1); // Entram 2 pessoas no elevador
        elevator.leave(19); // Saem 19 pessoas do elevador
        elevator.down(24); // O elevador desce 24 andares
    }
}
