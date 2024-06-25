public class Circulo extends Figura {
    private int raio;

    public Circulo(){
        this.raio = 1;
    }
    public Circulo(int raio){
        this.raio = raio;
    }
    public void setRaio(int raio){
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
