package br.ufal.ic.p3.effectivejava;

import java.util.*;

public class InstrumentedSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedSet(Set<E> es) {
        super(es);
    }

    public InstrumentedSet(int i, float v) {
        super(i, v);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
//        InstrumentedSet<String> s = new InstrumentedSet<String>();
//        s.addAll(Arrays.asList("One", "Two", "Three"));
//        System.out.println(s.getAddCount());

        InstrumentedSet<String> set1 = new InstrumentedSet<String>(new HashSet<String>(Arrays.asList("One", "Two", "Three")));
        InstrumentedSet<Integer> set2 = new InstrumentedSet<Integer>(new TreeSet<Integer>(Arrays.asList(1,2,3)));
    }

}
