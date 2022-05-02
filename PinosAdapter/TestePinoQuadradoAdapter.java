package PinosAdapter;

import java.util.Scanner;

public class TestePinoQuadradoAdapter {
    
    public static void main(String[] args) {
        // Round fits round, no surprise.
        BuracoRedondo buracoRedond = new BuracoRedondo(5);
        PinoRedondo pinoRedond = new PinoRedondo(5);
        PinoQuadrado pinoQuad1 = new PinoQuadrado(2);
        PinoQuadrado pinoQuad2 = new PinoQuadrado(20);
        // hole.fits(smallSqPeg); // Won't compile.s
    
        // Adapter solves the problem.
        PinoQuadradoAdapter smallSqPegAdapter = new PinoQuadradoAdapter(pinoQuad1);
        PinoQuadradoAdapter largeSqPegAdapter = new PinoQuadradoAdapter(pinoQuad2);
        if (buracoRedond.encaixa(smallSqPegAdapter)) {
            System.out.println("O pino quadrado encaixa no buraco redondo.");
        }
        if (!buracoRedond.encaixa(largeSqPegAdapter)) {
            System.out.println("O pino quadrado não encaixa no buraco redondo.");
        }
    }

}
