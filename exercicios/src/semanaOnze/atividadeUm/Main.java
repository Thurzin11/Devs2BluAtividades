package semanaOnze.atividadeUm;

import semanaOnze.atividadeUm.cores.*;
import semanaOnze.atividadeUm.formas.Circulo;
import semanaOnze.atividadeUm.formas.Forma;
import semanaOnze.atividadeUm.formas.Quadrado;

public class Main {
    public static void main(String[] args) {
        Forma circuloVermelho = new Circulo(new Vermelho(),new Tracejado());
        circuloVermelho.desenhar();

        Forma quadradoAzul = new Quadrado(new Azul(),new Solido());
        quadradoAzul.desenhar();

        Forma circuloVerde = new Circulo(new Verde(),new Tracejado());
        circuloVerde.desenhar();

        Forma quadradoVerde = new Quadrado(new Verde(),new Solido());
        quadradoVerde.desenhar();

    }
}
