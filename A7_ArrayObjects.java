class ArrayObjects{
    public static void main(String ar[]){
        Employee E1=new Employee();
        E1.id=61;
        E1.salary=30123;

        Employee E2=new Employee();
        E2.id=26;
        E2.salary=32100;

        Employee arr[]=new Employee[2];
        arr[0]=E1;
        arr[1]=E2;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].id+ " : " +arr[i].salary);
        }

        for(Employee i:arr ){
            System.out.println(i.id+ " -> " +i.salary);
        }
        

    }
}

class Employee{
    public int id;
    public int salary;
}