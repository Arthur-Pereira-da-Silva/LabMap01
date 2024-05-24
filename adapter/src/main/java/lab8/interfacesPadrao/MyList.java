package lab8.interfacesPadrao;

import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {
    boolean add(E e);
    void clear();
    boolean contains(Object o);
    boolean equals(Object o);
    E get(int index);
    boolean isEmpty();
    Iterator<E> iterator();
    boolean remove(Object o);
    int size();
    Object[] toArray();
}