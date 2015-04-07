
public class JTest {
  public static void main(String[] args) {
    //boolean result = isUnique("Hello world");
    //System.out.println("The result is: "+result);
    
    circularList(10);
  }
  
  
  
  
  public static boolean isAnagram(String a, String b){
    
    HashMap<char,int> string1;
    HashMap<char,int> string2;
    
    if(a.length != b.length) return false;
    string1 = histo(a);
    string2 = histo(b);
    
    for(Map.Entry<char, int> entryMap : string1.entrySet()){
      if(!string2.containsKey(entryMap.getKey())) return false;
      if(string2.get(entryMap.getKey()) != enrtyMap.getValue()) return false;
    }
    return true;
  }
  
  public static HashMap<char,int> histo(String s) {
    HashMap<char,int> hash = new HashMap<char,int>();
    
    for(char c: s.toCharArray()){
      if(hash.get(c) != null){
        int i  = hash.get(c);
        hash.put(c,i+1);
      }
      else{
        hash.put(c,1);
      }
    }
    return hash;
  }
  
  public static class Node{
    public int data;
    public Node next;
  }
  
  public static void circularList(int hops){
    
    int N =1000;
    Node root = new Node();
    Node conductor = root;
     //creation
    for(int i= 1; i< N; i++){
      conductor.data = i;
      conductor.next = new Node();
      conductor = conductor.next;
    }
    conductor.next = root;
    //deletion
     conductor = root;
     
    for(int i= 1; i < N; i+=hops){
      for(int j = 1; j < hops; j++){
        conductor = conductor.next;
      }
      conductor.next = conductor.next.next;
      System.out.println("Deleting node: "+conductor.next.data);
    }
    
  }
  
  
  public static boolean isUnique(String input){
    boolean charPresent[] = new boolean[255];
    boolean flag = false;
      char[] charInput = input.toCharArray();
   
   for(int i =0; i< charInput.length; i++){
     if(charPresent[(int)charInput[i]] == true) {
      flag = false;
      break;
     }
     else{
       charPresent[(int)charInput[i]] = true;
         flag = true;
       }
   }
   return flag;
  }
}