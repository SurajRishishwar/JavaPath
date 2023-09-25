class StaticVariable{
    public static void main(String ar[]){
        School s1=new School();
        s1.teachers=23;
        s1.students=546;
        School.schoolName="KV2"; // access by class
        s1.show();

        School s2 = new School();
        s2.students=990;
        s2.teachers=1;
        s2.show();


    }
}

class School{
    int teachers;
    int students;
    static String schoolName; // by default = null

    public void show(){
        System.out.println(schoolName+" : "+teachers+" : "+students);
    }
}