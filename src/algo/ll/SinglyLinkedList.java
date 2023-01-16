package algo.ll;

public class SinglyLinkedList {
    Node head;
    Node tail;
    private int len;

    public SinglyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        len = 1;
    }

    public int getHead() {
        if(head == null) return 0;
        else return head.value;
    }

//    public void setHead(Node head) {
//        this.head = head;
//    }

    public Node getTail() {
        if (tail == null) return null;
        else return tail;
    }

//    public void setTail(Node tail) {
//        this.tail = tail;
//    }

    public int getLen() {
        return len;
    }

    public void appendAtLast(int value) {
        Node newNode = new Node(value);
        if (len == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            len += 1;
        }
    }
    public void appendFirst(int value) {
        Node newNode = new Node(value);
        if(len == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            len += 1;
        }
    }

    public void printSLL() {
        Node temp = head;
        while (temp != null) {
            System.out.println(" " + temp.value);
//            Log.info(" {}" + temp.value);
            temp = temp.next;
        }
    }

    public void clearLL() {
        head = null;
        tail = null;
    }
}


//    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
//
//        if(head == null) {
//            return new SinglyLinkedListNode(data);
//        } else {
//            SinglyLinkedListNode temp = head;
//            while(temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = new SinglyLinkedListNode(data);
//            return head;
//        }
//
//
//    }
