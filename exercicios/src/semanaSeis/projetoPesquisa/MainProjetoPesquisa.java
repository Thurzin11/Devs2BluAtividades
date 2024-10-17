package semanaSeis.projetoPesquisa;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainProjetoPesquisa {
    public static void main(String[] args) {
        List<ProjetoPesquisa> projetos = new ArrayList<>();
        String[] opcoes = {
                "Cadastrar projeto e adicionar um integrante",
                "Cadastrar projeto e adicionar mais de um integrante",
                "Cadastrar mais de um projeto e adicionar integrantes",
                "Mostrar detalhes de um projeto",
                "Sair"
        };
        boolean keep = true;
        while (keep){
            int escolha = JOptionPane.showOptionDialog(null,"Escolha a opção","Pesquisas",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcoes,opcoes[0]);

            switch (escolha){
                case 0:
                    projetos.add(cadastrarProjetoPesquisa(1));
                    break;
                case 1:
                    int quantidadeIntegrantes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de integrantes"));
                    projetos.add(cadastrarProjetoPesquisa(quantidadeIntegrantes));
                    break;
            }
        }
    }
    private static ProjetoPesquisa cadastrarProjetoPesquisa(int quantidadeIntegrantes){
        String codigo = JOptionPane.showInputDialog(null,"Digite um codigo do projeto");
        String titulo = JOptionPane.showInputDialog(null,"Digite o titulo do projeto");
        Date dataInicio = obterData("Informe uma data de inicio no formato dd/MM/yyyy");
        Date dataFim = obterData("Informe uma data de fim no formato dd/MM/yyyy");
        System.out.println(dataInicio);
        System.out.println(dataFim);
        String nomeProfessorResponsavel = JOptionPane.showInputDialog(null,"Digite o nome do professor responsavel");
        Double salarioProfessorResponsavel = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salario do professor responsavel"));
        Professor professorResponsavel = new Professor(nomeProfessorResponsavel,salarioProfessorResponsavel);
        List<Pesquisador> pesquisadores = new ArrayList<>();
        for (int i = 0; i < quantidadeIntegrantes; i++) {
            String[] professorOrAluno = {"Professor","Aluno"};
            int decisao2 = JOptionPane.showOptionDialog(null,"Escolha a opção do integrante","Professor ou Aluno",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,professorOrAluno,professorOrAluno[0]);
            if (decisao2 == 0){
                Professor professor = new Professor();
                professor.setNome(JOptionPane.showInputDialog(null,"Digite o nome do professor"));
                professor.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o salario do professor")));
                pesquisadores.add(professor);
            } else if (decisao2 == 1) {
                Aluno aluno = new Aluno(JOptionPane.showInputDialog("Digite o nome do aluno"));
                pesquisadores.add(aluno);
            }
        }
        ProjetoPesquisa projetoPesquisa = new ProjetoPesquisa(codigo,titulo,dataInicio,dataFim,professorResponsavel,pesquisadores);
        return projetoPesquisa;
    }

//    private static List<ProjetoPesquisa> cadastrarProjetosPesquisa(int quantidadeIntegrantes){
//        List<ProjetoPesquisa> projetos = new ArrayList<>();for (int i = 0; i < quantidadeIntegrantes; i++) {
//            String[] opcoes = {"Adicionar","Parar"};
//
//        }
//    }

    private static Date obterData(String mensagem) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        while (data == null) {
            String dataStr = JOptionPane.showInputDialog(mensagem);
            try {
                data = format.parse(dataStr);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Data inválida! Por favor, insira no formato dd/MM/yyyy.");
            }
        }
        return data;
    }
}
