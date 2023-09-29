import java.util.HashSet;
import java.util.Set;

public class E9_CollectionSet {
    public static void main(String ar[]){


        Set<Integer>obj = new HashSet<Integer>();
        obj.add(3);
        obj.add(6);
        obj.add(22);
        obj.add(22);// not contain in sorted form due to hashset

        System.out.println(obj);

    }
}
