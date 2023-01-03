package algo.ll;

public class SLLOperations {
    public static void main(String args[]) {
        SinglyLinkedList sll = new SinglyLinkedList(9);
        sll.appendAtLast(4);
        sll.appendAtLast(7);
        sll.appendFirst(5);
        sll.printSLL();
        System.out.println("Head : "+ sll.getHead());
        System.out.println("Tail : "+ sll.getTail().value);
        System.out.println("Length : "+ sll.getLen());
    }
}
