
public class Main {
  public static void main(String[] args) { 
    int delCount = 0;
    Node root = new Node();
    Node conductor;
    conductor = root;
    
    for(int i = 1; i<=1000; i++) {
      conductor.x = i;
      conductor.next = new Node();
      conductor = conductor.next;
    }
    conductor.next = root;
    
    Node temp;
    Node prev;
    prev = conductor;
    conductor = root;
    while(conductor.next != prev) {
      for(int i = 1; i<40; i++) {
        prev = conductor;
        conductor = conductor.next;
      }
      prev.next = conductor.next;
      conductor = conductor.next;
      temp = conductor;
      System.out.println("Deleting node: "+temp.x);
      delCount++;
    }
    System.out.println("\nDeleted nodes: "+delCount);
  }
}
