import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class AdapterMapToList{
    private Map<String, String> map = new HashMap<>();

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public AdapterMapToList(){}

    public AdapterMapToList(Map<String, String> map){
        this.map = map;
    }

    public void add(String key, String value){
        map.put(key, value);
    }

    public void clear(){
        map.clear();
    }

    public Boolean contains(String key){
        return map.containsKey(key);
    }

    public Boolean equals() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Este HashMap não suporta a operação equals de List.");
    }  

    public String get(String key){
        return map.get(key);
    }

    public Boolean isEmpty(){
        return map.isEmpty();
    }

    public List<String> iterator()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Este HashMap não suporta a operação iterator de List.");
    } 
    
    public void remove(String chave){
        map.remove(chave);
    }

    public int size(){
        return map.size();
    }

    public List<String> toArray()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Este HashMap não suporta a operação toArray de List.");
    } 
}
