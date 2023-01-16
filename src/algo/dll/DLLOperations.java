package algo.dll;

public class DLLOperations {
    public static void main(String args[]) {
        DoublyLinkedList dll = new DoublyLinkedList(5);
        dll.appendNodeAtFront(7);
        dll.appendNodeAtFront(6);
        dll.appendNodeAtLast(9);
        dll.InsertBefore(dll.getHead().next, 8);
        dll.insertAfter(dll.getHead().next.next, 2);
        dll.printDLL();
        System.out.println();
        System.out.println("Length: " + dll.getLen());
        System.out.println("Head: " + dll.getHead().value);
        System.out.println("Tail: " + dll.getTail().value);
    }
}
