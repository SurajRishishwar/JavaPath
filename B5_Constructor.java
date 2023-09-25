class constor{
    public static void main(String ar[]){
        Car c = new Car();// Default Constructor
        Car c1 = new Car(2019);// Parameterized Constructor
        System.out.println(c.model);
        System.out.println(c1.model);


    }
}

class Car{
    Car(){// Default Constructor
        model=4078;
    }

    Car(int model){// Parameterized Constructor
        this.model=model;
    }
    public int model;
}