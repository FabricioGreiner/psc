public class Tv extends EletroDomestico {

    private int tamanho;
    private int canal;
    private int volume;

    public Tv(boolean ligada, int voltagem) {
        super(ligada, voltagem);
    }

    public Tv(int tamanho,int voltagem){
        super(voltagem);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
