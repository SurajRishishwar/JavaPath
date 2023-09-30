import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class F5_ConsumerForEach {
    public static void main(String ar[]){
        List<Integer> nums = new ArrayList<>();

        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer i){
                System.out.println(i);
            }
        };

        nums.add(54);
        nums.add(63);

        nums.forEach(con);

        System.out.println(nums);
    }
}
