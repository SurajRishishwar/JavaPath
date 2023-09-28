
public class D2_Enum1 {
        public static void main(String ar[]){
            // System.out.println(Try.s.ordinal());
            Try[] typeall= Try.values();
            for(Try i:typeall){
                System.out.println(i.ordinal()+" : "+i);
            }
        }

}
enum Try{
    s,t,u;
}
