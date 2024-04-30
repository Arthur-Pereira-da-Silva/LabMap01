import src.SIG.Sig;
import src.SistemaDeApoio.Item;
import src.SistemaDeApoio.TiposDeSalas;

public class Main {

    public static void main(String[] args) {
        Sig uepb = new Sig();

        // Adiciona entrevistas
        uepb.addEntrevita(2024, 4, 20, 11, 0);
        uepb.addEntrevita(2024, 4, 21, 11, 0);

        // Cria alunos e professores
        uepb.criarAluno("Kaio");
        uepb.criarAluno("Arthur");
        uepb.criarProfessor("Sabrina");
        
        // Cria disciplina e adiciona professor
        uepb.criarDisciplina("MAP", 2024, 4, 22, 11, 0);
        uepb.addDisciplinaProfessor(uepb.getProfessores().get(0), uepb.getDisciplinas().get(0));

        // Adiciona pessoas para entrevista e reunião
        uepb.addPessoaEntrevista(0, uepb.getAlunos().get(0));
        uepb.addPessoaEntrevista(0, uepb.getProfessores().get(0));
        uepb.addPessoaReuniao(1, uepb.getAlunos().get(1));
        uepb.addPessoaReuniao(1, uepb.getProfessores().get(0));

        // Verifica reuniões
        System.out.println("Reuniões:");
        uepb.verReunioes();

        // Adiciona pagamento e verifica custo total e folha de pagamento
        uepb.addPagamento(uepb.getProfessores().get(0), 15000);
        uepb.custoTotal();
        System.out.println("\nFolha de Pagamento:");
        uepb.verFolhaPagamento();

        // Configura tempo de casa do professor
        uepb.getProfessores().get(0).setTempoDeCasa(10.00f);

        // Configura alunos nas disciplinas e verifica grade
        uepb.getDisciplinas().get(0).setAlunos(uepb.getAlunos());
        System.out.println("\nGrade do Aluno:");
        uepb.getAlunos().get(0).getGrade();

        // Adiciona itens ao almoxarifado e verifica lista de itens
        uepb.addItem(1, "Sabão", 10);
        uepb.addItem(0, "Detergente", 15);
        
        // Adiciona itens com descrição
        Item item1 = new Item(5.99f, "Caneta AB1", "Caneta de ponta fina e Cor Azul");
        Item item2 = new Item(2.49f, "Lapis Grafite", "Lapis grafite da Faber Castel");
        
        // Imprime os itens com descrição
        System.out.println("\nItens no Almoxarifado:");
        System.out.println(item1);
        System.out.println(item2);

        // Adiciona salas à infraestrutura e verifica lista de salas
        // Adiciona salas à infraestrutura e verifica lista de salas
        uepb.addSala(110, TiposDeSalas.AULA, "Sala de aula 110"); // Adiciona descrição à sala 110
        uepb.addSala(120, TiposDeSalas.AULA, "Sala de aula 120"); // Adiciona descrição à sala 120
        
        System.out.println("\nSalas na Infraestrutura:");
        System.out.println(uepb.getCct().getSalas());
    }
}
