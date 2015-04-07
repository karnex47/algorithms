import java.lang.Integer;
import java.lang.Double;
import java.lang.Math;

public class BitShift {
  public static void main(String[] args) {
    /*String d_string = "3.14";
    double n = Double.parseDouble(d_string);
    int mask = ~0;
    for (int i = 1; i<=10; i++) {
      mask = (mask<<2)+1;
    }
    //System.out.printf("%.2f\n",n%1);
    //System.out.println((int)(n - n%1));
    */
    //***********
    int n = 3856;
    int length = (Integer.toBinaryString(n)).length();
    System.out.println(Integer.toBinaryString(n));
    //Find out the number of 1's
    int count = 0;
    for (int i = 1; i<=length; i++) {
      if((n&(1<<i)) != 0) count++;
    }
    System.out.println(count);
    
    // Getting the max/min
    int max = 0;
    int min = 0;
    for (int i = 1; i<=length; i++) {
      if(count>0) {
        max = (max<<1)+1;
        min = (min<<1)+1;
      }
      else {
        max = max<<1;
      }
      count--;
    }
    System.out.println("Max: "+max+" ["+Integer.toBinaryString(0x55555555)+"]"+
                       "\nMin: "+min+" ["+Integer.toBinaryString(min)+"]");
  }
}