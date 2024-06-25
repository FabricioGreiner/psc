public class Radio extends EletroDomestico implements ControleRemoto {

    private short AM = 1;
    private short FM = 2;
    private int banda;
    private float sinfonia;
    private int volume;

    public Radio(int voltagem) {
        super(voltagem);
    }
    public int getBanda() {
        return banda;
    }

    public void setBanda(int banda) {
        this.banda = banda;
    }

    public float getSinfonia() {
        return sinfonia;
    }

    public void setSinfonia(float sinfonia) {
        this.sinfonia = sinfonia;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void mudarCanal(int canal) {

    }

    @Override
    public void aumentarVolume(int volume) {
            this.volume += volume;
    }

    @Override
    public void diminuirVolume(int volume) {
            this.volume -= volume;
    }

    @Override
    public void ligar() {
        System.out.print("O rádio está ligado. ");
    }

    @Override
    public void desligar() {
        System.out.print("O rádio está desligado");
    }
}
