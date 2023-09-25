class StaticMethod{
    public static void main(String ar[]){
        School s1=new School();
        s1.teachers=34;
        s1.students=2223;
        School.schoolName="AFS";
        s1.show();
        School.showas(s1);
    }
}


class School{
    int teachers;
    int students;
    static String schoolName; // by default = null

    public void show(){
        System.out.println(schoolName+" : "+teachers+" : "+students);
    }

    public static void showas(School s1){
        System.out.println(schoolName+" : "+s1.teachers+" : "+s1.students);

    }

    
}