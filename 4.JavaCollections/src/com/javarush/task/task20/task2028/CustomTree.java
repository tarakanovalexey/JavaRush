package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;
    private ArrayList<Entry> arrayList = new ArrayList<>();

    public CustomTree() {
        this.root = new Entry<>("0");
        arrayList.add(root);
    }

    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }
    public void add(int index, String element){
        throw new UnsupportedOperationException();
    }
    public String remove(int index){
        throw new UnsupportedOperationException();
    }
    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    public boolean addAll(int index, Collection<? extends String> c){
        throw new UnsupportedOperationException();
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return arrayList.size()-1;
    }

    @Override
    public boolean add(String s) {
        Entry<String> entry = new Entry<String>(s);
        if (!checkAvailabilityToAdd()) {
            runAllow();
        }
        for (Entry each : arrayList) {
            if (each.isAvailableToAddLeftChildren()) {
                entry.setParent(each);
                each.setLeftChild(entry);
                each.setAvailableToAddLeftChildren(false);
                break;
            } else if (each.isAvailableToAddRightChildren()) {
                entry.setParent(each);
                each.setRightChild(entry);
                each.setAvailableToAddRightChildren(false);
                break;
            }
        }
        arrayList.add(entry);
        return true;
    }

    public String getParent(String s) {
        for (Entry each : arrayList) {
            if (each.getElementName().equals(s) && each.getParent() != null)
                return each.getParent().getElementName();
        }
        return "null";
    }

    public boolean remove(Object o) {
        if (!(o instanceof String))
            throw new UnsupportedOperationException();
        boolean found = false;
        for (Entry each : arrayList) {
            if (each.getElementName().equals((String) o)) {
                found = true;
                break;
            }
        }
        if (found)
        removing((String) o);
        return true;
    }

    public void removing(String o){
        Entry<String> entry = null;
        for (Entry each : arrayList) {
            if (each.getElementName().equals(o)) {
                entry = each;
                break;
            }
        }
        if (entry.getRightChild() != null)
            removing(entry.getRightChild().getElementName());
        if (entry.getLeftChild() != null)
            removing(entry.getLeftChild().getElementName());
        if (entry.getParent().getRightChild() != null && entry.getParent().getRightChild().getElementName().equals(entry.getElementName()))
            entry.getParent().setAvailableToAddRightChildren(true);
        if (entry.getParent().getLeftChild() != null && entry.getParent().getLeftChild().getElementName().equals(entry.getElementName()))
            entry.getParent().setAvailableToAddLeftChildren(true);
        arrayList.remove(entry);
    }

    public boolean checkAvailabilityToAdd() {
        for (Entry each : arrayList) {
            if (each.isAvailableToAddChildren()) {
                return true;
            }
        }
        return false;
    }

    public void runAllow(){
        for (Entry each : arrayList) {
            if (each.getLeftChild() == null) {
                each.setAvailableToAddLeftChildren(true);
            }
            if (each.getRightChild() == null) {
                each.setAvailableToAddRightChildren(true);
            }
        }
    }


    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public String getElementName() {
            return elementName;
        }

        public void setAvailableToAddLeftChildren(boolean availableToAddLeftChildren) {
            this.availableToAddLeftChildren = availableToAddLeftChildren;
        }

        public void setAvailableToAddRightChildren(boolean availableToAddRightChildren) {
            this.availableToAddRightChildren = availableToAddRightChildren;
        }

        public Entry<T> getParent() {
            return parent;
        }

        public void setParent(Entry<T> parent) {
            this.parent = parent;
        }

        public Entry<T> getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Entry<T> leftChild) {
            this.leftChild = leftChild;
        }

        public Entry<T> getRightChild() {
            return rightChild;
        }

        public void setRightChild(Entry<T> rightChild) {
            this.rightChild = rightChild;
        }

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddLeftChildren() {
            return availableToAddLeftChildren;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddRightChildren||availableToAddLeftChildren;
        }

        public boolean isAvailableToAddRightChildren() {
            return availableToAddRightChildren;
        }
    }
}
