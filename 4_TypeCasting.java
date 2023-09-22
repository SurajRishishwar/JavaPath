class TypeCasting{
    public static void main(String ar[]){
        byte a = 67;
        int b = a;
        System.out.println(b); // Implicit casting or Convsersion.

        int c = 128;
        byte d = (byte) c;// not Working directly as above so we use Explicit casting. => [c%256] 
        System.out.println(d);

        byte g = 56;
        byte f = 32;
        int res = g*f; // Type Promotions 
        System.out.println(res);

    }
}