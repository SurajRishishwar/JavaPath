public class D1_Interface2 {
    public static void main(String ar[]){
        A obj = new B();
        obj.show();
        // A.era=4555; // This is not possible due to final 
        System.out.println(A.era);
    }
    
}


interface A{
    void show();// Methods in Interface are Public and Abstract Bydefault.
    int era= 2000;// Varibles are Final and Static here Bydefault.
}

class B implements A{

    public void show() {
        System.out.println("Here we Go....");       
    }

}