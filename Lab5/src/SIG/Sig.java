package src.SIG;

import java.util.ArrayList;

import src.SistemaDeApoio.Disciplina;
import src.SistemaDeApoio.Entrevista;
import src.SistemaDeApoio.Grade;
import src.SistemaDeApoio.Item;
import src.SistemaDeApoio.Meet;
import src.SistemaDeApoio.Reuniao;
import src.SistemaDeApoio.Sala;
import src.SistemaDeApoio.TiposDeSalas;
import src.Subsistemas.Administracao;
import src.Subsistemas.Almoxarifado;
import src.Subsistemas.Aluno;
import src.Subsistemas.Financeiro;
import src.Subsistemas.Infra_estrutura;
import src.Subsistemas.Pessoa;
import src.Subsistemas.Professor;
import src.Subsistemas.Salario;

public class Sig {
	//Administrativas (reuniões agendadas com a diretoria, entrevistas);

	private Administracao adm = new Administracao();

	public Administracao getAdm(){
		return adm;
	}

	public ArrayList<Meet> verReunioes(){
		adm.verTodosEncontros();
		return adm.getReunioes();
	}

	public Meet addReuniao(int ano, int mes, int dia, int hora, int minuto){
		Reuniao reuniao = adm.addReuniao(ano, mes, dia, hora, minuto);
		return reuniao;
	}

	public Meet addEntrevita(int ano, int mes, int dia, int hora, int minuto){
		Entrevista entrevista = adm.addEntrevista(ano, mes, dia, hora, minuto);
		return entrevista;
	}

	public Boolean addPessoaReuniao(int indexMeet, Pessoa pessoa){
		try{
			adm.getMeet(indexMeet).addParticipante(pessoa);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	public Boolean addPessoaEntrevista(int indexMeet, Pessoa pessoa){
		try{
			adm.getMeet(indexMeet).addParticipante(pessoa);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	// Financeiras (balanço de contas, folha de pagamento);
	
	Financeiro contabilidade = new Financeiro();

	public Financeiro getContabilidade(){
		return contabilidade;
	}

	public ArrayList<Salario> verFolhaPagamento(){
		System.out.println(contabilidade.getFolhaDePagamento().toString());
		return contabilidade.getFolhaDePagamento();
	}

	public double custoTotal(){
		System.out.println("Custo total: " + contabilidade.valorTotal());
		return contabilidade.valorTotal();
	}

	public float addPagamento(Professor professor, float valorSalario){
		contabilidade.addPagamento(professor, valorSalario);
		professor.setSalario(valorSalario);

		return professor.getSalario();
	}

	public Salario alterarValor(int index, float novoValor){
		contabilidade.getFolhaDePagamento().get(index).setValorSalario(novoValor);
		return contabilidade.getFolhaDePagamento().get(index);
	}
     
	public ArrayList<Salario> removerPagamento(int index){
		contabilidade.getFolhaDePagamento().remove(index);
		return contabilidade.getFolhaDePagamento();
	}

	// Relacionadas ao professores (alocação por disciplina, tempo de casa);

	private ArrayList<Professor> professores = new ArrayList<Professor>();

	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public ArrayList<Professor> getProfessores(){
		return professores;
	}
	
	public Professor criarProfessor(String nome){
		Professor novato = new Professor(nome);
		professores.add(novato);

		return novato;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Disciplina criarDisciplina(String nomeDisciplina, int ano, int mes, int dia, int hora, int minuto){
		Disciplina disciplina = new Disciplina(ano, mes, dia, hora, minuto, nomeDisciplina);
		disciplinas.add(disciplina);
		return disciplina;
	}

	public String addDisciplinaProfessor(Professor professor, Disciplina disciplina){
		disciplina.setProfessor(professor);
		return disciplina.getProfessor().getNome();
	}

	public float tempoDeCasa(int index){
		return professores.get(index).getTempoDeCasa();
	}

	// Relacionada aos alunos (histórico e RDM);

	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

	public ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	
	public Aluno criarAluno(String nome){
		Aluno novato = new Aluno(nome);
		alunos.add(novato);

		return novato;
	}

	public ArrayList<Grade> historicoAluno(int index){
		alunos.get(index).showGrade();
		return alunos.get(index).getGradeAnteriores();
	}

	// Ao almoxarifado (estoque, pedido de compra);

	Almoxarifado almo = new Almoxarifado();

	public Almoxarifado getAlmo(){
		return almo;
	}

	public ArrayList<Item> estoque(){
		almo.showAlmoxarifado();
		return almo.getItens();
	}

	public ArrayList<Item> pedidos(){
		almo.showPedidos();
		return almo.getPedidos();
	}

	public Item addItem(int tipo, String nomeItem, float preco){
		almo.addItem(tipo, nomeItem, preco);
		Item item = almo.getItem(almo.getItens().size()-1);
		return item;
	}

	public ArrayList<Item> removeItem(int tipo, int index){
		almo.removeItem(tipo,index);
		return almo.getItens();
	}

	//À infra-estrutura (alocação de salas).

	Infra_estrutura cct = new Infra_estrutura();

	public Infra_estrutura getCct(){
		return cct;
	}

	public Sala addSala(int numSala, TiposDeSalas tipo, String descricao){
			Sala sala = new Sala(numSala, tipo, descricao);
			cct.addSala(sala);
    	return sala;
	}


	public void removeSala(int index){
		cct.getSalas().remove(index);
	}
}	
