class StaticBlock{
    public static void main(String ar[]){
        School obj1=new School();
        obj1.teachers=1;
        obj1.students=234;
        obj1.show();

        School obj2 = new School();
        obj2.teachers=23;
        obj2.students=90;
        obj2.show();
    }
}

class School{

    int teachers;
    int students;
    static String schoolName; // by default = null

    static{
        schoolName="PvP";
    }

    public void show(){
        System.out.println(schoolName+" : "+teachers+" : "+students);
    }
}