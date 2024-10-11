package semanaCinco.exercicioTres;

public class MainImposto {
    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica("Jose",2600,"12345678910");
        System.out.println("O valor do imposto de "+pf1.getNome()+" é de: "+pf1.calculaImposto());

        PessoaFisica pf2 = new PessoaFisica("Pedro",1600,"12345678911");
        System.out.println("O valor do imposto de "+pf2.getNome()+" é de: "+pf2.calculaImposto());

        PessoaFisica pf3 = new PessoaFisica("Claudio",8600,"12345678912");
        System.out.println("O valor do imposto de "+pf3.getNome()+" é de: "+pf3.calculaImposto());

        PessoaJuridica pj1 = new PessoaJuridica("Papeis LTDA",55000.00,"12345678910111");
        System.out.println("O valor do imposto de "+pj1.getNome()+" é de: "+pj1.calculaImposto());

        PessoaJuridica pj2 = new PessoaJuridica("Joias LTDA",35000.00,"12345678910112");
        System.out.println("O valor do imposto de "+pj2.getNome()+" é de: "+pj2.calculaImposto());

        PessoaJuridica pj3 = new PessoaJuridica("Esportes LTDA",25000.00,"12345678910113");
        System.out.println("O valor do imposto de "+pj3.getNome()+" é de: "+pj3.calculaImposto());

    }
}
