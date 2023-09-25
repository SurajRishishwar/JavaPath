class This{
    public static void main(String ar[]){
        Human obj = new Human();
        obj.setage(22);
        obj.setname("Suraj");

        System.out.println("Age is : "+obj.getage());
        System.out.println("Id is : "+obj.getname());
        

    }
}

class Human{

    private int age;
    private String name;
    public int getage(){
        return age;
    }

    public String getname(){
        return name;
    }

    public void setage(int age){
       this.age=age;
    }
    public void setname(String name){
        this.name=name;
    }


}