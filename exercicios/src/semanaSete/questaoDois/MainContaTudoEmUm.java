package semanaSete.questaoDois;

public class MainContaTudoEmUm {
	
	    public static void main(String[] args) {
//	        Conta conta = new Conta("Jo�o Silva", 500.0);
//	        conta.depositar(200.0);
//	        conta.sacar(150.0);
//	        conta.gerarRelatorioSaldo();
//	        conta.gerarRelatorioTransacoes();
			 Conta conta = new Conta("Joao Silva",500.00);
			 conta.depositar(200.00);
			 conta.sacar(150.00);
			 RelatorioConta relatorio = new RelatorioConta(conta);
			 relatorio.gerarRelatorioSaldo();
			 relatorio.gerarRelatorioTransacoes();

	    }
}
