package semanaOnze.atividadeDois;

import semanaOnze.atividadeDois.empregados.Analista;
import semanaOnze.atividadeDois.empregados.GerenteProjetos;
import semanaOnze.atividadeDois.empregados.Secretaria;
import semanaOnze.atividadeDois.formatos.Csv;
import semanaOnze.atividadeDois.formatos.Json;

public class Main {
    public static void main(String[] args) {
        Analista analista = new Analista("Jose",22,2000.00,new Json());
        analista.gerarArquivo();
        GerenteProjetos gerenteProjetos = new GerenteProjetos("Pedro",30,4000.00,new Csv());
        gerenteProjetos.gerarArquivo();
        Secretaria secretaria = new Secretaria("Joao",25,1500.00,new Json());
        secretaria.gerarArquivo();
    }
}
