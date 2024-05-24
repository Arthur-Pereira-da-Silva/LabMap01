package lab8.adapters;

import java.util.Iterator;
import java.util.Map;

import lab8.interfacesPadrao.MyList;

public class MapToListAdapter<K, V> implements MyList<Map.Entry<K, V>> {
    private final Map<K, V> map;

    public MapToListAdapter(Map<K, V> map) {
        this.map = map;
    }

    // Método que lança exceção, pois não é suportado pela interface Map
    @Override
    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException("O método add não é suportado pela interface Map.");
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("O método contains não é suportado pela interface Map.");
    }

    @Override
    public boolean equals(Object o) {
        return map.entrySet().equals(o);
    }

    @Override
    public Map.Entry<K, V> get(int index) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        for (int i = 0; i < index; i++) {
            iterator.next();
        }
        return iterator.next();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }


    @Override
    public boolean remove(Object o) {
        if (!(o instanceof Map.Entry)) {
            return false; // Retorna falso se o objeto não for uma entrada de mapa
        }

        Map.Entry<K, V> entry = (Map.Entry<K, V>) o;
        // Use o método remove e retorne true se algo for removido (não nulo)
        return map.remove(entry.getKey()) != null;
    }



    @Override
    public int size() {
        return map.size();
    }

    // Método que lança exceção, pois não é suportado pela interface Map
    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("O método toArray não é suportado pela interface Map.");
    }

    // Método que lança exceção, pois não é suportado pela interface Map
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        throw new UnsupportedOperationException("O método iterator não é suportado pela interface Map.");
    }

    @Override
    public String toString() {
        return map.entrySet().toString();
    }
}
