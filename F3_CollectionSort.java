import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class F3_CollectionSort {
    public static void main(String ar[]){

        Comparator<Integer> nums=new Comparator<Integer>()
        {
            public int compare(Integer i,Integer j){
                if(i%10 > j%10){// sorted basedon unit digit
                    return 1;
                }else {
                    return -1;
                }
            }   
        };

        List<Integer> obj=new ArrayList<>();

        obj.add(33);
        obj.add(78);
        obj.add(90);
        obj.add(9);

        Collections.sort(obj,nums);

        System.out.println(obj);
    }
}
