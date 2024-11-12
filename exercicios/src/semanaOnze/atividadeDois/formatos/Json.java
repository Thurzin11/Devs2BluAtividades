package semanaOnze.atividadeDois.formatos;

public class Json implements Arquivo{
    @Override
    public void gerandoArquivo(String nome,Double salario,Integer idade) {
        System.out.println("{\n     nome:" + nome+
                ",\n     idade:"+ idade+
                ",\n     salario:"+ salario+
                "\n}");
    }
}