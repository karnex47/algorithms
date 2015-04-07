public class Test2 {
  public static void main(String args[]) {
    String s = "a_bbcccddddeff";
    int flag = 0;
    for(int i = 0; i<s.length(); ++i) {
      if(s.charAt(i) != s.charAt(i)) {
        System.out.println(s.substring(flag,i));
        flag = i;
      }
    }
    if(flag != s.length()-1) {
      System.out.println(s.substring(flag,s.length()-1));
    }
  }
}