package semanaCinco.exercicioDois;

public class MainIngressos {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50,5,"Blumenau","VIP");
        ingresso.imprimeTipo();
        ingresso.imprimeValor();
        System.out.println("O valor total do ingresso é de: "+ingresso.valorTotal());
    }
}
