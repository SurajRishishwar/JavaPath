public class D4_EnumWithClass {
    public static void main(String ar[]){
        Laptop obj =  Laptop.Macbook;
        System.out.println(obj+" : " +obj.getPrice());

        Laptop.XPS.setPrice(522);


        for(Laptop lap : Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }



    }
    
}

enum Laptop {
    Macbook(200), XPS, Hp(250);

    private int price;
    private Laptop(int price) {
        this.price = price;
    }
    
    
    
    private Laptop() {
     
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



}