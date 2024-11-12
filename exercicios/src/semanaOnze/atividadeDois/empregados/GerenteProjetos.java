package semanaOnze.atividadeDois.empregados;

import semanaOnze.atividadeDois.formatos.Arquivo;

public class GerenteProjetos extends Empregado{

    public GerenteProjetos(String nome, Integer idade, Double salario, Arquivo arquivo) {
        super(nome, idade, salario, arquivo);
    }

    public GerenteProjetos() {
    }

    @Override
    public void gerarArquivo() {
        this.getArquivo().gerandoArquivo(this.getNome(),this.getSalario(),this.getIdade());
    }
}
