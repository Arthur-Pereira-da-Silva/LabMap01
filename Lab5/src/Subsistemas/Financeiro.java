package src.Subsistemas;

import java.util.ArrayList;

// Representa o sistema financeiro da instituição, incluindo folha de pagamento e balanço de contas
public class Financeiro {

    private ArrayList<Salario> folhaDePagamento = new ArrayList<Salario>();

    // Construtor padrão
    public Financeiro() {}

    // Métodos getters e setters
    public ArrayList<Salario> getFolhaDePagamento() {
        return folhaDePagamento;
    }

    public void setFolhaDePagamento(ArrayList<Salario> folhaDePagamento) {
        this.folhaDePagamento = folhaDePagamento;
    }

    // Adiciona um novo pagamento à folha de pagamento
    public Salario addPagamento(Professor professor, float valorSalario) {
        Salario novoPagamento = new Salario(professor, valorSalario);
        folhaDePagamento.add(novoPagamento);
        return novoPagamento;
    }

    // Mostra a folha de pagamento
    public void mostrarFolha() {
        for (int i = 0; i < folhaDePagamento.size(); i++) {
            System.out.println(folhaDePagamento.get(i).toString());
        }
    }

    // Calcula o valor total da folha de pagamento
    public double valorTotal() {
        double total = 0;
        for (int i = 0; i < folhaDePagamento.size(); i++) {
            total += folhaDePagamento.get(i).getValorSalario();
        }
        return total;
    }

    // Sobrescrita do método toString para fornecer informações sobre a folha de pagamento
    @Override
    public String toString() {
        return "Folha de pagamento [ " + folhaDePagamento + " ]";
    }
}
