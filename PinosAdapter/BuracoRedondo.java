package PinosAdapter;

public class BuracoRedondo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public BuracoRedondo(double raio) {
        this.raio = raio;
    }

    public boolean encaixa(PinoRedondo pino) {
        boolean resultado;
        resultado = (this.getRaio() >= pino.getRaio());
        return resultado;
    }
}