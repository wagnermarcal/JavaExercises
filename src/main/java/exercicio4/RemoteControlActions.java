package exercicio4;

/**
 * Interface para implementar as respectivas ações base de um controle em todos controles que podem vir a ser criados.
 */
interface RemoteControlActions {
    /**
     * Método para aumentar o volume em uma unidade, porém só irá aumentar o volume se não estiver no máximo, caso contrário retornará uma mensagem de erro!
     */
    void increaseVolume();

    /**
     * Método para diminuir o volume em uma unidade, porém só irá diminuir o volume se não estiver no mínimo, caso contrário retornará uma mensagem de erro!
     */
    void decreaseVolume();

    /**
     * Método para passar de um canal para o outro, incrementa o canal em uma unidade, só irá para o próximo canal se não estiver no último canal, caso esteja, volta ao primeiro canal.
     */
    void passChannel();

    /**
     * Método para voltar de um canal para o outro, decrementa o canal em uma unidade, só irá para o canal anterior se não estiver no primeiro canal, caso esteja, retorna ao último canal.
     */
    void backChannel();

    /**
     * Método para consultar o volume, retorna o volume atual da televisão.
     */
    void consultVolume();

    /**
     * Método para consultar o canal, retorna o volume atual do canal.
     */
    void consultChannel();

    /**
     * Método para trocar de canal, é passado como parâmetro o novo canal, o canal não pode ser menor ou igual a 0 e precisa ser menor que o valor do último canal.
     *
     * @param novoCanal int - Parâmetro que passa como inteiro o valor do novo canal.
     */
    void changeChannel(int novoCanal);

}
