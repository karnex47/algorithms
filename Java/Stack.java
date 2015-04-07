import java.util.ArrayList;

public class Stack<T> {
  ArrayList<T> buffer = new ArrayList<T>();
  
  public void push(T node) {
    buffer.add(node);
  }
  
  public T pop() {
    if(buffer.size()>0) return buffer.remove(buffer.size()-1);
    return null;
  }
  
  public T peek() {
    if(buffer.size()>0) return buffer.get(buffer.size()-1);
    return null;
  }
  
  public boolean isEmpty() {
    return buffer.size() == 0;
  }
}