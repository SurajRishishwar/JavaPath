public class InheritanceCar {
    public static void main(String ar[]){
        Car obj = new Car();
        obj.drive();
    }
}

class Vehicle{
    public void drive(){
        System.out.println("Parent Vehicle");
    }
}
class Car extends Vehicle{
    
    public void drive(){
        System.out.println("Repairing a class");
    }
}
