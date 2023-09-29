public class E5_RunnableThread {
    public static void main(String ar[]){
        A obj1 = new A();
        B obj2 = new B();

        Thread t1= new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


    }
}

class A implements Runnable
{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("Tip!!!");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<4;i++){
            System.out.println("Top...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
