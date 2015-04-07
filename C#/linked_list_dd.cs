using System;

public class LinkedListPrac {
    static public void Main() {
        new LinkedListPrac().run();
    }
    public void run() {
        LinkedList<int> list = new LinkedList<int>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();
        list.remove(1);
        list.printList();
    }
    
    public class LinkedList<T> {
        private Node<T> head;
        public void addLast(T data) {
            Node<T> node = new Node<T>();
            node.data = data;
            if(head == null) {
                head = node;
            }
            else {
                Node<T> cur = head;
                while(cur.next != null) {
                    cur = cur.next;
                }
                cur.next = node;
            }
        }
        public void remove(T data) {
            if(head.data.Equals(data)) {
                head = head.next;
                return;
            }
            Node<T> cur = head;
            while(cur != null) {
                if(cur.next.data.Equals(data)) {
                    cur.next = cur.next.next;
                    break;
                }
                cur = cur.next;
            }
        }
        public void printList() {
            Node<T> cur = head;
            while(cur != null) {
                Console.WriteLine(cur.data);
                cur = cur.next;
            }
        }
        
    }
    public class Node<T> {
        public T data;
        public Node<T> prev = null;
        public Node<T> next = null;
    }
}