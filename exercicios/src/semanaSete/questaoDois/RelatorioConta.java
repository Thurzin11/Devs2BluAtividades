package semanaSete.questaoDois;

import java.util.List;

public class RelatorioConta {
    private Conta conta;

    public RelatorioConta(Conta conta) {
        this.conta = conta;
    }

    public RelatorioConta() {}

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void gerarRelatorioSaldo() {
        System.out.println("Relat�rio de Saldo");
        System.out.println("Titular: " + this.conta.getTitular());
        System.out.println("Saldo atual: " + this.conta.getSaldo());
    }

    // Fun��o para gerar relat�rio de transa��es
    public void gerarRelatorioTransacoes() {
        System.out.println("Relat�rio de Transa��es");
        List<String> transacoes = this.conta.getTransacoes().getTransacao();
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}
