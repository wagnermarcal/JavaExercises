package exercicio4;

/**
 * Classe que simula uma televis�o com os seus respectivos atributos.
 *
 * @author wagner.marcal
 * @version 1.0
 */
public class Tv {
    private int volume = 0;
    private int channel = 1;
    private final int maxVolume = 100;
    private final int maxChannel = 300;

    /**
     * M�todo para aumentar o volume em uma unidade, por�m s� ir� aumentar o volume se n�o estiver no m�ximo, caso contr�rio retornar� uma mensagem de erro!
     */
    public void increaseVolume() {
        if (this.volume + 1 <= this.getMaxVolume()) {
            this.volume += 1;
            System.out.println("Aumentando o volume " + "\nVolume atual: " + getVolume());
        } else {
            System.out.println("Volume m�ximo atingido!");
        }
    }

    /**
     * M�todo para diminuir o volume em uma unidade, por�m s� ir� diminuir o volume se n�o estiver no m�nimo, caso contr�rio retornar� uma mensagem de erro!
     */
    public void decreaseVolume() {
        if (this.volume - 1 > 0) {
            this.volume -= 1;
            System.out.println("Diminuindo o volume " + "\nVolume atual: " + getVolume());
        } else {
            System.out.println("Voc� n�o pode mais diminuir o valor, m�nimo de 0 atingido.");
        }
    }

    /**
     * M�todo para passar de um canal para o outro, incrementa o canal em uma unidade, s� ir� para o pr�ximo canal se n�o estiver no �ltimo canal, caso esteja, volta ao primeiro canal.
     */
    public void passChannel() {
        if (this.channel + 1 < maxChannel) {
            this.channel += 1;
            System.out.println("Passando para o pr�ximo canal!\nCanal atual: " + this.channel);
        } else {
            this.channel = 1;
            System.out.println("Voltando ao canal anterior!\nCanal atual: " + this.channel);
        }
    }

    /**
     * M�todo para voltar de um canal para o outro, decrementa o canal em uma unidade, s� ir� para o canal anterior se n�o estiver no primeiro canal, caso esteja, retorna ao �ltimo canal.
     */
    public void backChannel() {
        if (this.channel - 1 > 0) {
            this.channel -= 1;
            System.out.println("Passando para o canal anterior!\nCanal atual: " + this.channel);
        } else {
            this.channel = maxChannel;
            System.out.println("Voltando para o �ltimo canal!\nCanal atual: " + this.channel);
        }
    }

    /**
     * M�todo para consultar o volume, retorna o volume atual da televis�o.
     */
    public void consultVolume() {
        System.out.println("Volume atual: " + getVolume());
    }

    /**
     * M�todo para consultar o canal, retorna o volume atual do canal.
     */
    public void consultChannel() {
        System.out.println("Canal atual: " + getChannel());
    }

    /**
     * M�todo para trocar de canal, � passado como par�metro o novo canal, o canal n�o pode ser menor ou igual a 0 e precisa ser menor que o valor do �ltimo canal.
     *
     * @param newChannel int - Par�metro que passa como inteiro o valor do novo canal.
     */
    public void changeChannel(int newChannel) {
        if (newChannel > 0 && newChannel <= this.getMaxChannel()) {
            setChannel(newChannel);
        } else {
            System.out.println("Este canal n�o existe!");
        }
    }

    /**
     * M�todo para retornar o volume atual, utilizado somente na classe da televis�o.
     *
     * @return volume int - Retorna o valor inteiro do volume atual.
     */
    private int getVolume() {
        return volume;
    }

    /**
     * M�todo para retornar o canal atual, utilizado somente na classe da televis�o.
     *
     * @return canal int - Retorna o valor inteiro do canal atual.
     */
    private int getChannel() {
        return channel;
    }

    /**
     * M�todo para definir o volume, utilizado somente na classe da televis�o.
     *
     * @param volume int - Volume � ser definido, representado por um inteiro.
     */
    private void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * M�todo para definir um canal, utilizado somente na classe da televis�o.
     *
     * @param channel int - Canal � ser definido, representado por um inteiro.
     */
    private void setChannel(int channel) {
        this.channel = channel;
    }

    /**
     * M�todo para retornar o volume m�ximo, utilizado somente na classe da televis�o
     *
     * @return maxVolume int - Retorna o valor o valor inteiro do volume m�ximo.
     */
    private int getMaxVolume() {
        return maxVolume;
    }

    /**
     * M�todo para retornar o �ltimo canal, utilizado somente na classe da televis�o.
     *
     * @return maxCanal int - Retorna o valor inteiro do �ltimo canal.
     */
    private int getMaxChannel() {
        return maxChannel;
    }
}
