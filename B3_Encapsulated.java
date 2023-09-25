class Encapsule{
    public static void main(String ar[]){
        Teacher obj = new Teacher();
        obj.setage(22);
        obj.settid(33);

        System.out.println("Age is : "+obj.getage());
        System.out.println("Id is : "+obj.gettid());
        
    }
}

class Teacher{

    private int age;
    private int tid;

    public int getage(){
        return age;
    }

    public int gettid(){
        return tid;
    }

    public void setage(int n){
        age=n;
    }
    public void settid(int a){
        tid=a;
    }
}