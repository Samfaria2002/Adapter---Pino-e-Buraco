package PinosAdapter;

public class PinoQuadrado {
    private double largura;


    public double getLargura() {
        return largura;
    }

    public double getQuadrado() {
        return Math.pow(largura, 2);
    }

    public PinoQuadrado(double largura) {
        this.largura = largura;
    }
}
