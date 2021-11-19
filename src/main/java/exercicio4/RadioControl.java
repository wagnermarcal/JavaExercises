package exercicio4;

public class RadioControl extends Radio implements RemoteControlActions {

    /**
     * Método para aumentar o volume em uma unidade, porém só irá aumentar o volume se não estiver no máximo, caso contrário retornará uma mensagem de erro!
     */
    @Override
    public void increaseVolume() {
        super.increaseVolume();
    }

    /**
     * Método para diminuir o volume em uma unidade, porém só irá diminuir o volume se não estiver no mínimo, caso contrário retornará uma mensagem de erro!
     */
    @Override
    public void decreaseVolume() {
        super.decreaseVolume();
    }

    /**
     * Método para passar de um canal para o outro, incrementa o canal em uma unidade, só irá para o próximo canal se não estiver no último canal, caso esteja, volta ao primeiro canal.
     */
    @Override
    public void passChannel() {
        super.passStation();
    }

    /**
     * Método para voltar de um canal para o outro, decrementa o canal em uma unidade, só irá para o canal anterior se não estiver no primeiro canal, caso esteja, retorna ao último canal.
     */
    @Override
    public void backChannel() {
        super.backStation();
    }

    /**
     * Método para consultar o volume, retorna o volume atual da televisão.
     */
    @Override
    public void consultVolume() {
        super.consultaVolume();
    }

    /**
     * Método para consultar o canal, retorna o volume atual do canal.
     */
    @Override
    public void consultChannel() {
        super.consultStation();
    }

    /**
     * Método para trocar de canal, é passado como parâmetro o novo canal, o canal não pode ser menor ou igual a 0 e precisa ser menor que o valor do último canal.
     *
     * @param novoCanal int - Parâmetro que passa como inteiro o valor do novo canal.
     */
    @Override
    public void changeChannel(int novoCanal) {
        super.changeStation(novoCanal);
    }
}

