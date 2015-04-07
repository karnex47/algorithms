import java.util.*;
import java.lang.Integer;

public class Test1 {


    public static void main(String args[]){
        
        Integer[] arr = {1,2,3,4,4,5,6,7,8,9};
        List inputList = Arrays.asList(arr);
        HashSet input = new HashSet(inputList);
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();

        if(inputList.size() > input.size()) {
            System.out.println("There is duplicate");    
        }

        for(int i=0; i< inputList.size(); i++){
            map1.put(inputList.get(i), map1.get(inputList.get(i) + 1));
        }
        Set set = map1.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
             Map.Entry me = (Map.Entry)i.next();
             System.out.print(me.getKey() + ": ");
             System.out.println(me.getValue());
        }
    }
}
