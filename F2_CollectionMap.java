import java.util.HashMap;
import java.util.Map;
public class F2_CollectionMap {
    public static void main(String ar[]){
        Map<String,Integer> obj= new HashMap<String ,Integer>();

        obj.put("SUraj",61);
        obj.put("Egoistic",62);

        obj.keySet();
        for(String a:obj.keySet()){
            System.out.println(a+" : "+obj.get(a));
        }
        
    }
}
