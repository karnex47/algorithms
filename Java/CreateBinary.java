import java.lang.StringBuffer;

public class CreateBinary {
  public static void main(String[] args) {
    System.out.println(toBinary(0));
  }
  
  public static String toBinary(int d) {
    if(d==0) return ""+0;
    StringBuffer b_sb = new StringBuffer();
    int reminder = d%2;
    if(((d-reminder)/2) != 0)
      b_sb.append(toBinary((d-reminder)/2));
    b_sb.insert(0, ""+reminder);
    return b_sb.toString();
  }
}