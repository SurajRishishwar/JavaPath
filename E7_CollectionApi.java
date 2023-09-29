import java.util.ArrayList;
import java.util.Collection;

public class E7_CollectionApi {
    public static void main(String ar[]){
        Collection<Integer> obj=new ArrayList<Integer>();
        obj.add(2);
        obj.add(4);
        obj.add(6);
        obj.add(2);
    
            // THis is not support Indexing.
        System.out.println(obj);
        System.out.println(obj.size());


    }
}
