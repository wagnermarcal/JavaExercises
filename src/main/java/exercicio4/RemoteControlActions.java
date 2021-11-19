package exercicio4;

/**
 * Interface para implementar as respectivas a��es base de um controle em todos controles que podem vir a ser criados.
 */
interface RemoteControlActions {
    /**
     * M�todo para aumentar o volume em uma unidade, por�m s� ir� aumentar o volume se n�o estiver no m�ximo, caso contr�rio retornar� uma mensagem de erro!
     */
    void increaseVolume();

    /**
     * M�todo para diminuir o volume em uma unidade, por�m s� ir� diminuir o volume se n�o estiver no m�nimo, caso contr�rio retornar� uma mensagem de erro!
     */
    void decreaseVolume();

    /**
     * M�todo para passar de um canal para o outro, incrementa o canal em uma unidade, s� ir� para o pr�ximo canal se n�o estiver no �ltimo canal, caso esteja, volta ao primeiro canal.
     */
    void passChannel();

    /**
     * M�todo para voltar de um canal para o outro, decrementa o canal em uma unidade, s� ir� para o canal anterior se n�o estiver no primeiro canal, caso esteja, retorna ao �ltimo canal.
     */
    void backChannel();

    /**
     * M�todo para consultar o volume, retorna o volume atual da televis�o.
     */
    void consultVolume();

    /**
     * M�todo para consultar o canal, retorna o volume atual do canal.
     */
    void consultChannel();

    /**
     * M�todo para trocar de canal, � passado como par�metro o novo canal, o canal n�o pode ser menor ou igual a 0 e precisa ser menor que o valor do �ltimo canal.
     *
     * @param novoCanal int - Par�metro que passa como inteiro o valor do novo canal.
     */
    void changeChannel(int novoCanal);

}
