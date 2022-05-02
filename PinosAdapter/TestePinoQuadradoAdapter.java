package PinosAdapter;

import java.util.Scanner;

public class TestePinoQuadradoAdapter {
    
    public static void main(String[] args) {
        //Definindo objetos e fazendo a entrada de dados
        BuracoRedondo buracoRedond = new BuracoRedondo(5);
        PinoRedondo pinoRedond = new PinoRedondo(5);
        PinoQuadrado pinoQuad1 = new PinoQuadrado(2);
        PinoQuadrado pinoQuad2 = new PinoQuadrado(20);
        
        //Puxando a conversão
        PinoQuadradoAdapter smallSqPegAdapter = new PinoQuadradoAdapter(pinoQuad1);
        PinoQuadradoAdapter largeSqPegAdapter = new PinoQuadradoAdapter(pinoQuad2);

        //Condicional de tamanho do encaixe
        if (buracoRedond.encaixa(smallSqPegAdapter)) {
            System.out.println("O pino quadrado encaixa no buraco redondo.");
        }
        if (!buracoRedond.encaixa(largeSqPegAdapter)) {
            System.out.println("O pino quadrado não encaixa no buraco redondo.");
        }
    }

}
