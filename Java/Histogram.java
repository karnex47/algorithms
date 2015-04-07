import java.util.Map;
import java.util.HashMap;
public class Histogram {
  
  public static void main(String[] args) {
    //if(args.length() != 1) return;
    String targetString = "HelloWorld"; //args[0];
    histogram(targetString);
  }
  
  public static void histogram(String s) {
    Map<Character, Integer> histo = new HashMap<Character, Integer>();
    char c;
    for(int i = 0; i<s.length(); i++) {
      c = s.charAt(i);
      if(histo.containsKey(c)) {
        histo.put(c, histo.get(c) + 1);
      }
      else {
        histo.put(c,1);
      }
    }
    for(Map.Entry<Character, Integer> entry:histo.entrySet()) {
        System.out.println(entry.getKey()+": "+entry.getValue());
      }
  }
}