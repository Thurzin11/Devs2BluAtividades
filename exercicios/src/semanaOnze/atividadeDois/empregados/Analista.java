package semanaOnze.atividadeDois.empregados;

import semanaOnze.atividadeDois.formatos.Arquivo;

public class Analista extends Empregado {

    public Analista(String nome, Integer idade, Double salario, Arquivo arquivo) {
        super(nome, idade, salario, arquivo);
    }

    public Analista() {}

    @Override
    public void gerarArquivo() {
        this.getArquivo().gerandoArquivo(this.getNome(),this.getSalario(),this.getIdade());
    }
}
