public class C5_AbstractUasge {
    public static void main(String a[]){
        Bike obj = new Yamaha();
        obj.riding_speed();
        obj.noOfWheels();
    }
}

abstract class Bike{
    public abstract void riding_speed();// abstract method is used only inside the abstract class. in this we want that child class override this method. 
    public void noOfWheels(){// it is not necessary that an abstract class having an abstrect method.
        System.out.println("Compulsion of two wheels");
    } 
}

class Yamaha extends Bike{
    public void riding_speed(){ // overriding the method of abstract class.
        System.out.println("Speed : @220");
    }
}