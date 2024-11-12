package semanaOnze.atividadeDois.formatos;

public class Csv implements Arquivo{
    @Override
    public void gerandoArquivo(String nome,Double salario,Integer idade) {
        System.out.println(nome+";"+ idade+";"+ salario);
    }
}
