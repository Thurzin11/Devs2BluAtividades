package SemanaUm.nivel2;

public class QuestaoTres {
    public static void main(String[] args) {
        int quantidadeAcoes = 1000;
        double valorPago = quantidadeAcoes*32.87;
        System.out.println("Valor pago pelas acoes: " + valorPago);
        double taxaCorretor = valorPago*0.02;
        System.out.println("Taxa do corretor para a compra: " + taxaCorretor);
        double valorVendido = quantidadeAcoes*33.92;
        System.out.println("Valor vendido pelas acoes: " + valorVendido);
        double taxaCorretorVendido = valorVendido*0.02;
        System.out.println("Taxa do corretor para a venda: " + taxaCorretorVendido);
        double valorGanho = (valorVendido - taxaCorretorVendido) - (valorPago - taxaCorretor);
        System.out.println("Valor ganho pelas acoes: " + valorGanho);
    }
}

