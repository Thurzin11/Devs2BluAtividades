package semanaOnze.atividadeUm.formas;

import semanaOnze.atividadeUm.cores.Cor;
import semanaOnze.atividadeUm.cores.Estilo;

//Abstra��o Refinada para um Quadrado
public class Quadrado extends Forma {
    public Quadrado(Cor cor, Estilo estilo) {
        super(cor, estilo);
    }

    @Override
    public void desenhar() {
        System.out.print("Desenhando um quadrado com ");
        cor.aplicarCor();
        this.estilo.definirEstilo();
    }

}
