public class Teste {
    public static void main(String[] args) {
        Modelo1 modelo1 = new Modelo1(45,220);
        Modelo2 modelo2 = new Modelo2(30,110);
        Radio radio = new Radio(220);

        radio.setSinfonia(104.12F);
        radio.setVolume(20);

        radio.ligar();
        System.out.println("Volume: " + radio.getVolume() + " e Sinfonia: " + radio.getSinfonia());
        System.out.print("TV1:"); modelo1.ligar();
        System.out.print("TV2:"); modelo2.ligar();
        modelo1.desligar();
        modelo2.desligar();
        radio.desligar();
    }
}
