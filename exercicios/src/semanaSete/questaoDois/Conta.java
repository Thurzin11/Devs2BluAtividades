package semanaSete.questaoDois;

public class Conta {
    private String titular;
    private double saldo;
    private Transacao transacoes;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        String firstTransaction = "Conta criada com saldo inicial de: " + saldoInicial;
        Transacao transacoes = new Transacao();
        transacoes.adicionarTransacao(firstTransaction);
        this.transacoes = transacoes;
    }

    public Conta() {}

//    public Conta(String titular, double saldoInicial) {
//        this.titular = titular;
//        this.saldo = saldoInicial;
//        this.transacoes = new ArrayList<>();
//        transacoes.add("Conta criada com saldo inicial de: " + saldoInicial);
//    }

    // Fun��o para depositar dinheiro
    public void depositar(double valor) {
        this.saldo += valor;
        transacoes.adicionarTransacao("Dep�sito de: " + valor);
    }

    // Fun��o para sacar dinheiro
    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            transacoes.adicionarTransacao("Saque de: " + valor);
        } else {
            transacoes.adicionarTransacao("Tentativa de saque sem saldo suficiente: " + valor);
        }
    }

//    // Fun��o para gerar relat�rio de saldo
//    public void gerarRelatorioSaldo() {
//        System.out.println("Relat�rio de Saldo");
//        System.out.println("Titular: " + titular);
//        System.out.println("Saldo atual: " + saldo);
//    }
//
//    // Fun��o para gerar relat�rio de transa��es
//    public void gerarRelatorioTransacoes() {
//        System.out.println("Relat�rio de Transa��es");
//        for (String transacao : transacoes) {
//            System.out.println(transacao);
//        }
//    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Transacao getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(Transacao transacoes) {
        this.transacoes = transacoes;
    }

    // Fun��o para obter saldo atual
//    public double obterSaldo() {
//        return saldo;
//    }
    public double getSaldo() {
        return saldo;
    }
}
