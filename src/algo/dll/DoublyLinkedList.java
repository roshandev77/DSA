package algo.dll;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int len;

    public Node getTail() {
        return tail;
    }

    public int getLen() {
        return len;
    }

    public Node getHead() {
        return head;
    }

    public DoublyLinkedList(int value) {
        Node dNewNode = new Node(value);
        head = tail = dNewNode;
        len = 1;
    }

    public void printDLL() {
        System.out.println("Printing LL from front");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("Printing LL from back");
        Node last = tail;
        while (last != null) {
            System.out.print(last.value + " ");
            last = last.prev;
        }
    }

    public void appendNodeAtFront(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        head.prev = newNode;
        head = newNode;
        len += 1;
    }

    public void appendNodeAtLast(int value) {
        Node newNode = new Node(value);
        newNode.prev = tail;
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
        len += 1;
    }

    public void InsertBefore(Node refNode, int value) {
        Node newNode = new Node(value);

        newNode.prev = refNode.prev;
        refNode.prev = newNode;
        newNode.next = refNode;
        newNode.prev.next = newNode;

        len += 1;
    }

    public void insertAfter(Node preNode, int value) {
        Node newNode = new Node(value);

        newNode.next = preNode.next;
        preNode.next = newNode;
        newNode.prev = preNode;
        newNode.next.prev = newNode;

        len += 1;

    }

}

