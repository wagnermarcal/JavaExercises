package exercicio5;

/**
 * Class that represents a truck, which has its name, license plate and the pluviometers which it will load.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Pluviometer {
    private final String tipoPluv;
    private final int volumePluv;

    /**
     * Constructor method of the Pluviometer class.
     *
     * @param tipo String - Tipo do pluviômetro "Tipo 1" ou "Tipo 2".
     * @param ml   int - Capacidade do pluviômetro em mls.
     */
    public Pluviometer(String tipo, int ml) {
        tipoPluv = tipo;
        volumePluv = ml;
    }

    /**
     * Método para retornar a capacidade de volume do pluviômetro.
     *
     * @return volumePluv int - Retorna a capacidade de volume do pluviômetro em mls.
     */
    public int getVolumePluv() {
        return volumePluv;
    }

    /**
     * Método para retornar o tipo do pluviômetro.
     *
     * @return tipoPluv String - Retorna o tipo do pluviômetro.
     */
    public String getTipoPluv() {
        return this.tipoPluv;
    }

    @Override
    public String toString() {
        return "\nPluviometer Type: " + tipoPluv +
                "\nPluviometer volume: " + volumePluv + "\n";
    }
}
