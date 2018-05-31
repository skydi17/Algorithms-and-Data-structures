public class CheckHashTable {

    public static void main(String[] args) {
        HashTable table = new HashTable(10);

        table.add(1);
        table.add(3);
        table.add(5);

        System.out.println(table.search(1));
        table.delete(1);
        System.out.println(table.search(1));
    }
}
