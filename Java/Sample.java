import java.lang.Number.*;

class Sample {
  public static void findMissing(int[] arr) {
    int prevDiff = 0;
    for(int i = 0; i<arr.length-1; i++) {
      int diff = arr[i+1] - arr[i];
      if(prevDiff != 0 && diff != prevDiff) {
        System.out.println(arr[i]+prevDiff);
        break;
      }
      prevDiff = diff;
    }
  }
  void increment(int[] a) {
    
  }
    public static void main(String[] args) {
      double d = 10.0/-0;
      if(d == Double.POSITIVE_INFINITY)
        System.out.println("True");
      else 
        System.out.println("False");
        
  }
}