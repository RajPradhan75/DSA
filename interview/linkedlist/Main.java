package datastructures.src.com.interview.linkedlist;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        AddAndReverseLL linkedList = new AddAndReverseLL();
        for (int element : array) {
            linkedList.append(element);
        }

        System.out.println("Original linked list:");
        linkedList.display();

        System.out.println("Appended: ");
        linkedList.append(6);
        linkedList.display();

        linkedList.reverse();
        System.out.println("Reversed linked list:");
        linkedList.display();
    }
}
