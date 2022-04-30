public class BuracoRedondo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public BuracoRedondo(double raio) {}

    public void encaixa(PinoRedondo pino) {
        if (this.raio > pino.getRaio()) {
            System.out.println("Raio do buraco maior que o do pino");
        } else {
            System.out.println("Raio do buraco menor que o do pino");
        }
    }
}