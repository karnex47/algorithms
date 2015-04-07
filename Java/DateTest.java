import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
  public static void main(String[] args) {
    String dob = "08/24/1988";
    try {
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    
    Date d1 = format.parse(dob);
    Date d2 = format.parse(format.format(new Date()));
    
    long diff = d2.getTime() - d1.getTime();
    long diffDays = diff / (24 * 60 * 60 * 1000);
    System.out.println(diffDays + " days");
    }
    catch(Exception e) {}
  }
}