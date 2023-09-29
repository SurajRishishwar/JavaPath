import java.util.ArrayList;
import java.util.List;

public class E8_CollectionList {
    public static void main(String ar[]){
        List<Integer>obj= new ArrayList<Integer>();
        obj.add(5);
        obj.add(10);
        obj.add(250);
        System.out.println(obj.get(1));
        boolean i= obj.contains(250);
        System.out.println(i);
        
    }
}
