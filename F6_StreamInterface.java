import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class F6_StreamInterface {
    public static void main(String ar[]){

            
        List<Integer> nums= Arrays.asList(1,5,6,8); 
        
        //in a two way form

        Stream<Integer> s1=nums.stream();
        Stream<Integer> s2= s1.filter(n->n%2==0); 
        
        s2.forEach(n -> System.out.println(n));
        
        //in a single way

        int sum=nums.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0,(c,e) -> c+e);
        


        System.out.println(sum);


        // s1.forEach(n -> System.out.println(n));  it can be used only once 
    }
}
