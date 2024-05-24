package lab8.adapters;

import java.util.Collection;

import lab8.interfacesPadrao.MyList;
import lab8.interfacesPadrao.MyMap;

public class ListToMapAdapter<E> implements MyMap<Integer, E> {

    private MyList<E> list;

    public ListToMapAdapter(MyList<E> list) {
        this.list = list;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException("Método de Lista não suportado");
    }

    @Override
    public boolean containsValue(Object value) {
        throw new UnsupportedOperationException("Método de Lista não suportado");
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ListToMapAdapter) {
            ListToMapAdapter<?> other = (ListToMapAdapter<?>) o;
            return list.equals(other.list);
        }
        return false;
    }

    @Override
    public E get(Object key) {
        int index = (int) key;
        return list.get(index);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E put(Integer key, E value) {
        throw new UnsupportedOperationException("Método de Lista não suportado");
    }

    @Override
    public E remove(Object key) {
        int index = (int) key;
        E removedElement = list.get(index);
        list.remove(removedElement);
        return removedElement;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Collection<E> values() {
        throw new UnsupportedOperationException("Método de Lista não suportado");
    }
}