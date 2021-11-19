package exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa uma agenda, a agenda é do tipo lista e foi declarada na primeira linha do código.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Schedule {
    private final List<Person> schedule;

    /**
     * Método construtor da Agenda que instancia uma ArrayList do tipo Pessoas.
     */
    public Schedule() {
        schedule = new ArrayList<>(10);
    }

    /**
     * Método para armazenar as pessoas na ArrayList da Agenda com um limite de 10 pessoas, caso verdadeiro,
     * adiciona normalmente à lista, caso seja falso, retorna uma mensagem de erro que não foi possível incluir
     * o objeto, junto do seu respectivo nome.
     *
     * @param personToAdd Class Pessoas - Objeto da classe Pessoas contendo todos atributos passados no construtor da própria Classe.
     */
    public void addPerson(Person personToAdd) {
        if (arraySize() <= 10 - 1) {
            schedule.add(personToAdd);
        } else {
            System.out.println("Capacity exceeded! \nLimit of 10 people in the schedule. \nCould not add " +
                    personToAdd.getName() + " !!!");
        }
    }

    /**
     * Método para remover um objeto da classe Pessoas da lista agenda, também passa na saída do console o nome da pessoa
     * que é removida.
     *
     * @param person Class Pessoas - Objeto da classe Pessoas contendo todos os atributos passados no construtor da própria classe
     */
    public void removePessoa(Person person) {
        schedule.remove(person);
        System.out.println("Removendo: " + person.getName());
    }

    /**
     * Método para buscar um objeto da classe Pessoas da lista agenda, retorna o número do index o qual está esta pessoa.
     *
     * @param person Class Pessoas - Objeto da classe Pessoas contendo todos os atributos passados no construtor da própria classe
     */
    public void buscaPessoa(Person person) {
        System.out.println(schedule.indexOf(person));
        schedule.indexOf(person);
    }

    /**
     * Método para percorrer a ArrayList por um operador lógico de repetição for imprimindo todos os dados dos objetos da classe Pessoas que estão instanciados na agenda.
     */
    public void imprimeAgenda() { // Método para imprimir todas as pessoas que estão na agenda.
        for (Person p : schedule) {
            System.out.println(p.getData());
        }
    }

    /**
     * Método para imprimir objeto da classe Pessoas a partir do seu número inteiro correspondente ao index o qual o representa na ArrayList.
     *
     * @param index int - Parâmetro contendo o número de index o qual está inserido o objeto da classe Pessoas.
     */
    public void imprimePessoa(int index) {
        System.out.println(schedule.get(index).getData());
    }

    /**
     * Método para retornar um inteiro a partir do tamanho da ArrayList da agenda.
     *
     * @return agenda.size int - Retorna o número inteiro do tamanho da ArrayList.
     */
    public int arraySize() {
        return schedule.size();
    }
}
