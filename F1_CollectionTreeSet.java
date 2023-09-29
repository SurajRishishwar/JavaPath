import java.util.Collection;
import java.util.TreeSet;

class F1_CollectionTreeSet{
    public static void main(String ar[]){
        Collection<Integer> obj= new TreeSet<Integer>();
        obj.add(4);
        obj.add(67);
        obj.add(78);

        System.out.println(obj);

        java.util.Iterator<Integer> val= obj.iterator();
        while(val.hasNext())
            System.out.println(val.next());


    }
}