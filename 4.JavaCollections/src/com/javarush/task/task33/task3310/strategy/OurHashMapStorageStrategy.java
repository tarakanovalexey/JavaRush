package com.javarush.task.task33.task3310.strategy;

public class OurHashMapStorageStrategy implements StorageStrategy {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    Entry[] table = new Entry[DEFAULT_INITIAL_CAPACITY];
    int size;
    int threshold = (int) (DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
    float loadFactor = DEFAULT_LOAD_FACTOR;

    public int hash(Long k){
        return 0;
    }
    public int indexFor(int hash, int length){
        return 0;
    }
    public Entry getEntry(Long key){
        return null;
    }
    public void resize(int newCapacity){
        table = new Entry[newCapacity];
    }
    public void transfer(Entry[] newTable){

    }
    public void addEntry(int hash, Long key, String value, int bucketIndex){

    }
    public void createEntry(int hash, Long key, String value, int bucketIndex){

    }

    @Override
    public boolean containsKey(Long key) {
        return false;
    }

    @Override
    public boolean containsValue(String value) {
        return false;
    }

    @Override
    public void put(Long key, String value) {

    }

    @Override
    public Long getKey(String value) {
        return null;
    }

    @Override
    public String getValue(Long key) {
        return null;
    }
}
