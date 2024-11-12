package semanaOnze.atividadeDois.empregados;

import semanaOnze.atividadeDois.formatos.Arquivo;

public class Secretaria extends Empregado {

    public Secretaria(String nome, Integer idade, Double salario, Arquivo arquivo) {
        super(nome, idade, salario, arquivo);
    }

    public Secretaria() {}

    @Override
    public void gerarArquivo() {
        this.getArquivo().gerandoArquivo(this.getNome(),this.getSalario(),this.getIdade());
    }
}
