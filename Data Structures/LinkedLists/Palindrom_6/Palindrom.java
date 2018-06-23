import java.io.BufferedReader;
import java.io.InputStreamReader;


// O(N) time
// TODO what if DoublyLinkedList is not allowed?
public class Palindrom {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int size = Integer.parseInt((reader.readLine()));
            DoublyLinkedList list = new DoublyLinkedList((char) size);
            char[] input = reader.readLine().toCharArray();
            for (int i = 0; i < size; i++) {
                list.appendToTail(input[i]);
            }
            System.out.println(list.isPalindrom());
        } catch(Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
