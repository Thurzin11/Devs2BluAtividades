package semanaSete.questaoDois;

import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private List<String> transacoes;

    public Transacao(List<String> transacao) {
        this.transacoes = transacao;
    }

    public Transacao() {
        this.transacoes = new ArrayList<String>();
    }

    public void adicionarTransacao(String transacao) {
        this.transacoes.add(transacao);
    }

    public List<String> getTransacao() {
        return transacoes;
    }

    public void setTransacao(List<String> transacao) {
        this.transacoes = transacao;
    }


}
