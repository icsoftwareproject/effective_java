package br.ufal.ic.p3.effectivejava;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class ForwardingSet<E> implements Set<E> {

    private final Set<E> set;

    private ForwardingSet(Set<E> set) {
        this.set = set;
    }

    public int size() { return set.size(); }

    public boolean isEmpty() { return set.isEmpty(); }

    public boolean contains(Object o) { return set.contains(0); }

    public Iterator<E> iterator() { return set.iterator(); }

    public Object[] toArray() { return set.toArray(); }

    public boolean add(E e) { return set.add(e); }

    public boolean remove(Object o) {return set.remove(0);}

    public boolean containsAll(Collection<?> objects) { return set.containsAll(objects); }

    public boolean addAll(Collection<? extends E> es) { return set.addAll(es); }

    public boolean removeAll(Collection<?> objects) { return set.removeAll(objects); }

    public void clear() { set.clear(); }

}
