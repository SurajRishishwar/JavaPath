class stringtry{
    public static void main(String ar[]){
        // Preffered
        String name = "Suraj";
        System.out.println(name.length());

        //But as u Know String is a class
        String a = new String("Hello");
        System.out.println(a.length());

        //StringBuffer
        StringBuffer b = new StringBuffer("Hii World");
        System.out.println(b.length());
        System.out.println(b.capacity());

    }
}