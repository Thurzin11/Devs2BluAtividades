package semanaCinco.exercicioUm;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arthur",1000.00);
        funcionario.addAumento(500);
        funcionario.exibeDados();

        Assistente assistente = new Assistente("Jose",500.00,5);
        assistente.addAumento(500);
        assistente.exibeDados();

        Tecnico tecnico = new Tecnico("Pedro",700.00,15);
        tecnico.addAumento(500);
        tecnico.exibeDados();

        Administrativo administrativo = new Administrativo("Antonio",800.00,25);
        administrativo.addAumento(500);
        administrativo.exibeDados();
    }
}
