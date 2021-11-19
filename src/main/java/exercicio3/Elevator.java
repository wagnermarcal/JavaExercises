package exercicio3;

/**
 * Esta classe representa um elevador com os seus respectivos atributos e métodos.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Elevator {
    private int totalFloors, currentElevatorFloor, personsInElevator;
    private final int groundFloor = 0;
    private double elevatorCapacity;

    /**
     * Método inicializa para dar início à utilização do elevador, são passados os parâmetros:
     *
     * @param elevatorCapacity double - Capacidade do elevador.
     * @param totalFloors      int - Total de andares do prédio.
     *                         <p>
     *                         Também são definidos os atributos do andar atual e pessoas no elevador como sendo 0 na inicialização.
     */
    public void initialize(double elevatorCapacity, int totalFloors) {
        this.elevatorCapacity = elevatorCapacity;
        this.totalFloors = totalFloors;
        this.currentElevatorFloor = groundFloor;
        this.personsInElevator = 0;
        System.out.println("----------------------------\nInicializando o elevador!\n----------------------------");
    }

    /**
     * Método para que as pessoas entrem no elevador, é realizada uma verificação para confirmar se não excede a capacidade, se exceder, retorna uma mensagem de erro!
     *
     * @param peopleAmount int - Quantidade de pessoas que entrarão no elevador.
     */
    public void enter(int peopleAmount) {
        if (personsInElevator + peopleAmount <= elevatorCapacity) {
            this.personsInElevator += peopleAmount;
            System.out.println("Entraram " + peopleAmount + " pessoas ao elevador, agora temos um total de: " +
                    personsInElevator + " pessoas no elevador!");
        } else {
            System.out.println("Capacidade excedida!");
        }
    }

    /**
     * Método para que as pessoas saíam do elevador, é realizada uma verificação para confirmar se a quantidade de pessoas a sair do elevador não é maior que a quantidade
     * de pessoas no elevador, caso seja, retorna uma mensagem de erro!
     *
     * @param peopleAmount int - Quantidade de pessoas que sairão do elevador.
     */
    public void leave(int peopleAmount) {
        if (personsInElevator - peopleAmount >= 0) {
            this.personsInElevator -= peopleAmount;
            System.out.println("Saíram " + peopleAmount + " pessoas do elevador, agora temos um total de: " +
                    personsInElevator + " pessoas no elevador!");
        } else {
            System.out.println("Não há tal quantidade de pessoas no elevador!");
        }
    }

    /**
     * Método para que o elevador suba pelos andares, é realizada uma verificação para confirmar se o andar que ele irá subir não excede o total de andares do prédio, caso exceda, retorna uma mensagem de erro!
     *
     * @param floors int - Quantidade de andares à subir.
     */
    public void up(int floors) {
        if (currentElevatorFloor + floors < totalFloors) {
            this.currentElevatorFloor += floors;
            System.out.println("Subindo " + floors + " andares no elevador, agora estamos no andar: " + currentElevatorFloor);
        } else {
            System.out.println("O prédio não possui tantos andares!");
        }
    }

    /**
     * Método para que o elevador desça pelos andares, é realizada uma verificação para confirmar se o andar que ele irá descer não é inferior ao andar 0 - Térreo, caso seja inferior, retorna uma mensagem de erro!
     *
     * @param floors int - Quantidade de andares a descer.
     */
    public void down(int floors) {
        if (currentElevatorFloor - floors >= 0) {
            this.currentElevatorFloor -= floors;
            System.out.println("Descendo " + floors + " andares no elevador, agora estamos no andar: " + currentElevatorFloor);
        } else {
            System.out.println("Não é possível descer tantos andares, é possível descer somente até o térreo!");
        }
    }

    /**
     * Método para retornar a quantidade de andares no prédio.
     *
     * @return String - Total de andares no prédio.
     */
    public String getTotalFloors() {
        return "Total de andares do prédio: " + totalFloors;
    }

    /**
     * Método para retornar o andar que representa o térreo, por padrão 0.
     *
     * @return String - Andar do térreo.
     */
    public String getGroundFloor() {
        return "O número que representa o terreo é o numero: " + groundFloor;
    }

    /**
     * Método para retornar o andar atual o qual o elevador se encontra.
     *
     * @return String - Andar atual do elevador.
     */
    public String getCurrentElevatorFloor() {
        return "Andar atual do elevador: " + currentElevatorFloor;
    }

    /**
     * Método para retornar a capacidade do elevador.
     *
     * @return String - Capacidade do elevador.
     */
    public String getElevatorCapacity() {
        return "Capacidade do elevador: " + elevatorCapacity;
    }

    /**
     * Método para retornar a quantidade de pessoas que se encontram no elevador no presente momento.
     *
     * @return String - Pessoas no elevador.
     */
    public String getPersonsInElevator() {
        return "Quantidade atual de pessoas no elevador: " + personsInElevator;
    }
}
