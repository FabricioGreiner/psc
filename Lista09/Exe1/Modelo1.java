public class Modelo1 extends Tv implements ControleRemoto{
    private String modelo1;

    public Modelo1(int tamanho, int voltagem){
        super(tamanho,voltagem);
    }

    @Override
    public void mudarCanal(int canal) {
        super.setCanal(canal);
    }

    @Override
    public void aumentarVolume(int volume) {
        super.setVolume(volume);
    }

    @Override
    public void diminuirVolume(int volume) {
        super.setVolume(volume);
    }

    @Override
    public void ligar() {
        super.setLigada(true);
        System.out.println("A TV Modelo1 está ligada");

    }

    @Override
    public void desligar() {
        super.setLigada(false);
        System.out.println("Desligando a TV Modelo1");
    }
}
