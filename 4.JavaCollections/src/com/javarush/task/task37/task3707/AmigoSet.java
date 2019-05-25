package com.javarush.task.task37.task3707;

import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet implements Serializable, Cloneable, Set {

    private final static Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        int capacity = Math.max(16, (int) Math.floor(collection.size() / .75f) + 1);
        map = new HashMap<>(capacity);

        for (E e : collection) {
            add(e);
        }
    }

    @Override
    public boolean add(Object e) {
        return null == map.put((E) e, PRESENT);
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean remove(Object o) {
        return null == map.remove(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try
        {
            AmigoSet amigo = (AmigoSet) super.clone();
            amigo.map = (HashMap) map.clone();
            return amigo;
        }
        catch (Exception e)
        {
            throw new InternalError();
        }
    }
}
