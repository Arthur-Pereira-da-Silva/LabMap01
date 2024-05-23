import java.util.ArrayList;
import java.util.List;
import org.javatuples.Pair;

public class AdapterListoToMap{
    private List<Pair<String, String>> lista = new ArrayList<>();

    public List<Pair<String, String>> getLista() {
        return lista;
    }

    public void setLista(List<Pair<String, String>> lista) {
        this.lista = lista;
    }

    public AdapterListoToMap(){}

    public AdapterListoToMap(List<Pair<String, String>> lista){
        this.lista = lista;
    }

    public void clear(){
        lista.clear();
    }

    public void put(Pair<String, String> objeto){
        lista.add(objeto);
    }

    public void containsKey(String chave) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Esta lista não suporta a operação containsKey de Map.");
    }    

    public Boolean containsValue(String valor) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Esta lista não suporta a operação containsValue de Map.");
    }

    public Boolean equals()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Esta lista não suporta a operação equals de Map.");
    }
    public String get(String chave)throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Esta lista não suporta a operação get de Map.");
    }

    public Boolean isEmpty(){
        return lista.isEmpty();
    }

    public void remove(String chave)throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Esta lista não suporta a operação remove de Map.");
    }

    public int size(){
        return lista.size();
    }

    public List<String> values()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Esta lista não suporta a operação remove de Map.");
    }
}
