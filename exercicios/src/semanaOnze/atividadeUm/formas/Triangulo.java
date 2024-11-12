package semanaOnze.atividadeUm.formas;

import semanaOnze.atividadeUm.cores.Cor;
import semanaOnze.atividadeUm.cores.Estilo;

public class Triangulo extends Forma{
    public Triangulo(Cor cor, Estilo estilo) {
        super(cor,estilo);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando Triangulo");
        cor.aplicarCor();
        this.estilo.definirEstilo();
    }
}
