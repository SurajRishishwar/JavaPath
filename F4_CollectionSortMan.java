import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class F4_CollectionSortMan {
    public static void main(String ar[]){

        Comparator<String> comp = new Comparator<String>() {
            public int compare(String i,String j){
                if(i.length() > j.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        List<String> names = new ArrayList<String>();

        names.add("Shruti");
        names.add("suraj");
        names.add("shiv");
        names.add("s");
        names.add("rahulgandhi");

        Collections.sort(names,comp);

        System.out.println(names);
    }
}
