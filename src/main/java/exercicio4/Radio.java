package exercicio4;

/**
 * Classe que simula uma televisão com os seus respectivos atributos.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Radio {
    private int volume = 0;
    private int station = 1;
    private final int maxVolume = 100;
    private final int lastStation = 300;

    /**
     * Método para aumentar o volume em uma unidade, porém só irá aumentar o volume se não estiver no máximo, caso contrário retornará uma mensagem de erro!
     */
    public void increaseVolume() {
        if (this.volume + 1 <= this.getMaxVolume()) {
            this.volume += 1;
            System.out.println("Aumentando o volume " + "\nVolume atual: " + getVolume());
        } else {
            System.out.println("Volume máximo atingido!");
        }
    }

    /**
     * Método para diminuir o volume em uma unidade, porém só irá diminuir o volume se não estiver no mínimo, caso contrário retornará uma mensagem de erro!
     */
    public void decreaseVolume() {
        if (this.volume - 1 > 0) {
            this.volume -= 1;
            System.out.println("Diminuindo o volume " + "\nVolume atual: " + getVolume());
        } else {
            System.out.println("Você não pode mais diminuir o valor, mínimo de 0 atingido.");
        }
    }

    /**
     * Método para passar de um canal para o outro, incrementa o canal em uma unidade, só irá para o próximo canal se não estiver no último canal, caso esteja, volta ao primeiro canal.
     */
    public void passStation() {
        if (this.station + 1 < lastStation) {
            this.station += 1;
            System.out.println("Passando para o próximo canal!\nCanal atual: " + this.station);
        } else {
            this.station = 1;
            System.out.println("Voltando ao canal anterior!\nCanal atual: " + this.station);
        }
    }

    /**
     * Método para voltar de um canal para o outro, decrementa o canal em uma unidade, só irá para o canal anterior se não estiver no primeiro canal, caso esteja, retorna ao último canal.
     */
    public void backStation() {
        if (this.station - 1 > 0) {
            this.station -= 1;
            System.out.println("Passando para o canal anterior!\nCanal atual: " + this.station);
        } else {
            this.station = lastStation;
            System.out.println("Voltando para o último canal!\nCanal atual: " + this.station);
        }
    }

    /**
     * Método para consultar o volume, retorna o volume atual da televisão.
     */
    public void consultaVolume() {
        System.out.println("Volume atual: " + getVolume());
    }

    /**
     * Método para consultar o canal, retorna o volume atual do canal.
     */
    public void consultStation() {
        System.out.println("Canal atual: " + getStation());
    }

    /**
     * Método para trocar de canal, é passado como parâmetro o novo canal, o canal não pode ser menor ou igual a 0 e precisa ser menor que o valor do último canal.
     *
     * @param newStation int - Parâmetro que passa como inteiro o valor do novo canal.
     */
    public void changeStation(int newStation) {
        if (newStation > 0 && newStation <= this.getLastStation()) {
            setStation(newStation);
        } else {
            System.out.println("Este canal não existe!");
        }
    }

    /**
     * Método para retornar o volume atual, utilizado somente na classe da televisão.
     *
     * @return volume int - Retorna o valor inteiro do volume atual.
     */
    private int getVolume() {
        return volume;
    }

    /**
     * Método para retornar o canal atual, utilizado somente na classe da televisão.
     *
     * @return canal int - Retorna o valor inteiro do canal atual.
     */
    private int getStation() {
        return station;
    }

    /**
     * Método para definir o volume, utilizado somente na classe da televisão.
     *
     * @param volume int - Volume à ser definido, representado por um inteiro.
     */
    private void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Método para definir um canal, utilizado somente na classe da televisão.
     *
     * @param station int - Canal à ser definido, representado por um inteiro.
     */
    private void setStation(int station) {
        this.station = station;
    }

    /**
     * Método para retornar o volume máximo, utilizado somente na classe da televisão
     *
     * @return maxVolume int - Retorna o valor o valor inteiro do volume máximo.
     */
    private int getMaxVolume() {
        return maxVolume;
    }

    /**
     * Método para retornar o último canal, utilizado somente na classe da televisão.
     *
     * @return maxCanal int - Retorna o valor inteiro do último canal.
     */
    private int getLastStation() {
        return lastStation;
    }
}
