package exercicio4;

public class Main {

    public static void main(String[] args) {
        TvControl tvControl = new TvControl(); // Instanciando um objeto da classe ControleTv.

        tvControl.increaseVolume(); // Aumentando o volume em 1, volume atual: 1
        tvControl.increaseVolume(); // Aumentando o volume em 1, volume atual: 2
        tvControl.decreaseVolume(); // Diminuindo o volume em 1, volume atual: 1

        tvControl.consultVolume(); // Retorna volume atual, volume atual: 1
        tvControl.consultVolume(); // Retorna volume atual, volume atual: 1
        tvControl.consultChannel(); // Retorna canal atual, canal atual: 1

        tvControl.backChannel(); // Voltando canal, como estava no primeiro, passou para o último, canal atual: 300
        tvControl.passChannel(); // Passando canal, como estava no último, passou para o primeiro, canal atual: 1
        tvControl.changeChannel(21); // Trocando canal atual para o canal 21, canal atual: 21
        tvControl.consultChannel(); // Retorna canal atual, canal atual: 21

        RadioControl radioControl = new RadioControl();

    }
}
