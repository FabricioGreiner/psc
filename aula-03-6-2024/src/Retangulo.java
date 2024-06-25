public class Retangulo extends Figura {
    private int altura;
    private int largura;

    //Construtores
    public Retangulo(){
        this.altura = 1;
        this.largura = 2;
    }
    public Retangulo(int altura, int largura){
        this.altura = altura;
        this.largura = largura;
    }
    //Métodos


    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }


}
