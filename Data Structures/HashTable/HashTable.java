public class HashTable {

    private LinkedList[] hashTable;

    HashTable(Integer size) {
        hashTable = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashTable[i]  = new LinkedList();
        }
    }

    public void add(Integer value) {
        Integer hash = value % hashTable.length;
        hashTable[hash].add(value);
    }

    public void delete(Integer value) {
        Integer hash = value % hashTable.length;
        hashTable[hash].delete(hashTable[hash].search(value));
    }

    public LinkedList.LinkedListElement search(Integer value) {
        Integer hash = value % hashTable.length;
        return hashTable[hash].search(value);
    }
}
