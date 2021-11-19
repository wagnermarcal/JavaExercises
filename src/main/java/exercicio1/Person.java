package exercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Esta classe representa uma pessoa com os respectivos atributos
 *
 * @author Wagner Marçal
 * @version 1.0
 */
public class Person {
    private String name;
    private String height;
    private LocalDate birthDate;
    private int age;

    /**
     * Método construtor da classe Pessoa, onde são passados como parâmetros:
     *
     * @param name      String - Nome da pessoa
     * @param birthDate String - Data de nascimento da pessoa
     * @param height    String - Altura da pessoa
     */
    public Person(String name, String birthDate, String height) {
        this.setName(name);
        this.setBirthDate(birthDate);
        this.setHeight(height);
        this.getIdade();
    }

    /**
     * Método para atribuir um nome a um objeto da classe Pessoa.
     *
     * @param name String - Nome da pessoa
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para retornar o nome do objeto da classe Pessoa.
     *
     * @return nome String - Nome da pessoa
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método para atribuir a data de nascimento ao objeto da classe Pessoa.
     *
     * @param birthDate String - Data de nascimento da pessoa.
     */
    public void setBirthDate(String birthDate) {
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatacao);
    }

    /**
     * Método para retornar a data de nascimento do objeto da classe Pessoa.
     *
     * @return dataNascimento String - Data de nascimento da pessoa.
     */
    public String getBirthDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedBirthDate = birthDate.format(formatter);
        return formattedBirthDate;
    }

    /**
     * Método para atribuir a altura ao objeto da classe Pessoa.
     *
     * @param height String - Altura da pessoa.
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Método para retornar a altura do objeto da classe Pessoa.
     *
     * @return altura String - Altura da pessoa.
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * Método para calcular a idade do objeto da classe Pessoa, é utilizado o LocalDate e Period da biblioteca java.time
     * a partir da String dataNascimento, utiliza-se o split e parse, para separar e transformar em inteiros a entrada
     * de String do usuário, por fim, utiliza-se o Period.between entre a data atual e a data de nascimento, assim
     * determinando a idade.
     */
    public void getIdade() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = this.birthDate;
        age = Period.between(birthDate, today).getYears();
    }

    /**
     * Método para imprimir no console todas as informações do objeto da classe Pessoa.
     *
     * @return String - Retorna os dados da pessoa.
     */
    public String getData() {
        return String.format("Name: %s \nBirthdate: %s \nHeight: %s \nAge: %d", this.name, getBirthDate(), this.height, this.age);
    }
}
