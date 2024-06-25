public abstract class EletroDomestico {

    private boolean ligada;
    private int voltagem;

    public EletroDomestico(boolean ligada,int voltagem){
        this.ligada = ligada;
        this.voltagem = voltagem;
    }

    public EletroDomestico(int voltagem){
        this.voltagem = voltagem;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem() {
        this.voltagem = voltagem;
    }
}