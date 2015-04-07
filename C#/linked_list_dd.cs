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
        list.remove(2);
        list.printList();
        list.addFirst(-1);
        list.addFirst(-2);
        list.printList();
    }
    
    public class LinkedList<T> {
        private Node<T> head;
        private int size = 0;
        public void addLast(T data) {
            size++;
            Node<T> node = new Node<T>();
            node.data = data;
            if(head == null) {
                head = node;
                return;
            }
            Node<T> cur = head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
        public void addFirst(T data) {
            size++;
            Node<T> node = new Node<T>();
            node.data = data;
            if(head == null) {
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }
        public void remove(T data) {
            if(head.data.Equals(data)) {
                head = head.next;
                size--;
                return;
            }
            Node<T> cur = head;
            while(cur != null) {
                if(cur.next.data.Equals(data)) {
                    cur.next = cur.next.next;
                    size--;
                    break;
                }
                cur = cur.next;
            }
        }
        public Node<T> find(T data) {
            Node<T> cur = head;
            while(cur != null) {
                if(cur.data.Equals(data)) {
                    return cur;
                }
            }
            return null;
        }
        public void printList() {
            Node<T> cur = head;
            while(cur != null) {
                Console.WriteLine(cur.data);
                cur = cur.next;
            }
        }
        public int length() {
            return size;
        }
    }
    public class Node<T> {
        public T data;
        public Node<T> next = null;
    }
}