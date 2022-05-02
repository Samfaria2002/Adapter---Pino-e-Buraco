package PinosAdapter;

public class PinoQuadradoAdapter extends PinoRedondo {
    private PinoQuadrado pino;

    public double getRaio(PinoQuadrado pinoquad) {
        return Math.sqrt(Math.pow(pinoquad.getLargura() / 2, 2) * 2);
    }

    public PinoQuadradoAdapter(PinoQuadrado pino) {
        this.pino = pino;
    }
}