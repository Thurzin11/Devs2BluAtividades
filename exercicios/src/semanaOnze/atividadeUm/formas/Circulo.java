package semanaOnze.atividadeUm.formas;

import semanaOnze.atividadeUm.cores.Cor;
import semanaOnze.atividadeUm.cores.Estilo;

//Abstra��o Refinada para um C�rculo
public class Circulo extends Forma {
    public Circulo(Cor cor, Estilo estilo) {
        super(cor, estilo);
    }

    @Override
    public void desenhar() {
        System.out.print("Desenhando um c�rculo com ");
        cor.aplicarCor();
        this.estilo.definirEstilo();
    }

}