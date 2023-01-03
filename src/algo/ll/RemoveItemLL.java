package algo.ll;

public class RemoveItemLL {

    LinkedList ll = new LinkedList(5);

    class LinkedList {
        private Node head;
        private Node tail;
        private int len = 0;

        public LinkedList(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            len += 1;
        }

        public void append(int value) {
            Node newNode = new Node(value);
            if(len == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void printLL() {
            Node temp = head;
            while (temp.next != null) {
                System.out.println(" " + temp.value);
                temp = temp.next;
            }
        }

        class Node {
            int value;
            Node next;
            public Node(int value) {
                this.value = value;
            }
        }
    }
}


