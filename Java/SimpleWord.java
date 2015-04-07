public class SimpleWord {
  public static void main(String[] args) {
    char c = 'a';
    //System.out.printf("%02x\n",255);
    int x = 0xff;
    int y = 0xff;
    System.out.printf("%b\n", x & y);
  }
}