package semanaSeis.projetoPesquisa;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainProjetoPesquisa {
    public static void main(String[] args) {
//        lista principal de projetos
        List<ProjetoPesquisa> projetos = new ArrayList<>();
//        quantidade de vezes para serem implementadas em cada projeto e integrante
        int quantidadeIntegrantes = 1;
        int quantidadeProjetos = 1;
//        array de strings para ser utilizado como menu
        String[] opcoes = {
                "Cadastrar projeto e adicionar um integrante",
                "Cadastrar projeto e adicionar mais de um integrante",
                "Cadastrar mais de um projeto e adicionar integrantes",
                "Mostrar detalhes de um projeto",
                "Sair"
        };
//        variavel e metodo que controlam o menu
        boolean keep = true;
        while (keep){
//            menu sendo gerado com base no joptionpane que mapeia as opcoes em botoes e o botao selecionado retorna o indice dele no vetor
            int escolha = JOptionPane.showOptionDialog(null,"Escolha a opção","Pesquisas",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcoes,opcoes[0]);

//            switch case utilizado para chamar a funcao de acordo com o selecionado
            switch (escolha){
                case 0:
//                    inicializa com base na opcao
                    quantidadeIntegrantes = 1;
                    quantidadeProjetos = 1;
//                    chama a funcao cadastrarProjetoPesquisa e passa os parametros e retorna uma lista de projetos que adicional na lista principal
                    projetos.addAll(cadastrarProjetoPesquisa(quantidadeProjetos,quantidadeIntegrantes));
                    break;
                case 1:
//                    inicializa com base na opcao
                    quantidadeIntegrantes = 1;
//                    pergunta a quantidade de integrantes que o usuario deseja adicionar no projeto
                    quantidadeIntegrantes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de integrantes"));
//                    chama a funcao cadastrarProjetoPesquisa e passa os parametros e retorna uma lista de projetos que adicional na lista principal
                    projetos.addAll(cadastrarProjetoPesquisa(quantidadeProjetos,quantidadeIntegrantes));
                    break;
                case 2:
//                    pergunta a quantidade de projetos que o usuario deseja adicionar
                    quantidadeProjetos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de projetos"));
//                    pergunta a quantidade de integrantes que o usuario deseja adicionar no projeto
                    quantidadeIntegrantes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de integrantes"));
//                    chama a funcao cadastrarProjetoPesquisa e passa os parametros e retorna uma lista de projetos que adicional na lista principal
                    projetos.addAll(cadastrarProjetoPesquisa(quantidadeProjetos,quantidadeIntegrantes));
                    break;
                case 3:
//                    solicita ao usuario o codigo que corresponde ao projeto que ele procura
                    String codigo = JOptionPane.showInputDialog("Digite o codigo do projeto");
//                    instancia um projeto nulo
                    ProjetoPesquisa projetoPesquisaFound = null;
//                    procura o projeto com base no codigo e adiciona na variavel projetoPesquisaFound o objeto encontrado
                    for(ProjetoPesquisa projeto : projetos){
                        if (codigo.equalsIgnoreCase(projeto.getCodigo()))
                            projetoPesquisaFound = projeto;
                    }
//                    se o projeto for encontrado ele ira mostrar a mensagem projeto encontrado com sucesso senao ele mostra a projeto nao encontrado
//                    e retorna ao menu inicial
                    if(projetoPesquisaFound != null){
//                        mostra mensagem
                        JOptionPane.showMessageDialog(null,"Projeto enconctrado com sucesso!");
//                        mostra detalhes do projeto encontrado com base no metodo
                        String detalhes = projetoPesquisaFound.mostrarDetalhes();
                        JOptionPane.showMessageDialog(null,detalhes);
                    }else {
//                        mostra mensagem
                        JOptionPane.showMessageDialog(null,"Projeto não encontrado!");
                    }
                    break;
                case 4:
//                    avisa que o usuario saiu e troca a variavel keep para false e termina o programa
                    JOptionPane.showMessageDialog(null,"Voce saiu!!!");
                    keep = false;
                    break;
            }
        }
    }
//    funcao que retorna uma lista de ProjetoPesquisa com base nos parametros e com base no que o usuario informar
    private static List<ProjetoPesquisa> cadastrarProjetoPesquisa(int quantidadeProjetos,int quantidadeIntegrantes){
        List<ProjetoPesquisa> projetos = new ArrayList<>();
//        for que controla a quantidade de projetos
        for (int i = 0; i < quantidadeProjetos; i++) {
//            pergunta ao usuario os dados do projeto
            String codigo = JOptionPane.showInputDialog(null,"Digite um codigo do projeto");
            String titulo = JOptionPane.showInputDialog(null,"Digite o titulo do projeto");
            Date dataInicio = obterData("Informe uma data de inicio no formato dd/MM/yyyy");
            Date dataFim = obterData("Informe uma data de fim no formato dd/MM/yyyy");
            String nomeProfessorResponsavel = JOptionPane.showInputDialog(null,"Digite o nome do professor responsavel");
            Double salarioProfessorResponsavel = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salario do professor responsavel"));
            Professor professorResponsavel = new Professor(nomeProfessorResponsavel,salarioProfessorResponsavel);
            List<Pesquisador> pesquisadores = new ArrayList<>();
//            for que controla a quantidade de integrantes
            for (int j = 0; j < quantidadeIntegrantes; j++) {
//                array de opcoes em que o usuario podera selecionar
                String[] professorOrAluno = {"Professor","Aluno"};
//                menu sendo gerado com base no joptionpane que mapeia as opcoes em botoes e o botao selecionado retorna o indice dele no vetor
                int decisao2 = JOptionPane.showOptionDialog(null,"Escolha a opção do integrante","Professor ou Aluno",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,professorOrAluno,professorOrAluno[0]);
//                verifica a decisao do usuario e pede informações respectivas a sua escolha e add a lista de pesquisadores
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
//            gera o projeto com base nos dados e add no array de projetos
            ProjetoPesquisa projetoPesquisa = new ProjetoPesquisa(codigo,titulo,dataInicio,dataFim,professorResponsavel,pesquisadores);
            projetos.add(projetoPesquisa);
        }
//        retorna o array de projetos
        return projetos;
    }

//    funcao utilizada para formatar a data de uma srting para um tipo date normal
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
