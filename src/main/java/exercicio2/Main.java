package exercicio2;

public class Main {

    public static void main(String[] args) {
        Person wagner = new Person("Wagner", "05-04-2000", "1,87"); // Instanciando wagner como uma pessoa com os seus respectivos atributos.
        Person ana = new Person("Ana", "09-08-1969", "1,67"); // Instanciando ana como uma pessoa com os seus respectivos atributos.
        Person amanda = new Person("Amanda", "05-12-2001", "1,65"); // Instanciando amanda como uma pessoa com os seus respectivos atributos.
        Person luis = new Person("Luis", "18-03-1966", "1,78"); // Instanciando luis como uma pessoa com os seus respectivos atributos.
        Person joao = new Person("Joao", "16-07-2002", "1,81"); // Instanciando joao como uma pessoa com os seus respectivos atributos.
        Person michel = new Person("Michel", "21-09-2000", "1,75"); // Instanciando michel como uma pessoa com os seus respectivos atributos.
        Person davi = new Person("Davi", "25-01-2000", "1,70"); // Instanciando davi como uma pessoa com os seus respectivos atributos.
        Person aline = new Person("Aline", "03-08-1999", "1,62"); // Instanciando aline como uma pessoa com os seus respectivos atributos.
        Person roberto = new Person("Roberto", "11-07-1994", "1,90"); // Instanciando roberto como uma pessoa com os seus respectivos atributos.
        Person maria = new Person("Maria", "30-10-2002", "1,59"); // Instanciando maria como uma pessoa com os seus respectivos atributos.
        Person jean = new Person("Jean", "05-01-1994", "1,76"); // Instanciando jean como uma pessoa com os seus respectivos atributos.

        Schedule schedule1 = new Schedule(); // Instanciando um objeto da classe Agenda contendo uma ArrayList da classe Pessoas.

        //agenda1.armazenaPessoa(new Pessoas()); // Armazenando amanda na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(wagner); // Armazenando wagner na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(ana); // Armazenando ana na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(amanda); // Armazenando luis na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(luis); // Armazenando joao na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(joao); // Armazenando michel na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(michel); // Armazenando davi na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(davi); // Armazenando aline na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(aline); // Armazenando roberto na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(roberto); // Armazenando maria na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.removePessoa(roberto); // Armazenando roberto na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.removePessoa(michel); // Armazenando michel na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.removePessoa(joao); // Armazenando joao na ArrayList do tipo Pessoas da classe Agenda.
        schedule1.addPerson(maria); // Armazenando jean na ArrayList do tipo Pessoas da classe Agenda.

        schedule1.buscaPessoa(aline); // Buscando dados da Pessoa aline.
        schedule1.imprimePessoa(5); // Imprimindo dados da pessoa que está no index 5 da lista.

        schedule1.imprimeAgenda(); // Imprimindo todas as pessoas contidas na ArrayList agenda.

        System.out.println(schedule1.arraySize()); // Imprimindo o tamanho da ArrayList.
    }
}


