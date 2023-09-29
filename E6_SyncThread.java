
public class E6_SyncThread {
    public static void main(String ar[]) throws InterruptedException{
        Counter ct = new Counter();

        Runnable obj1 =()->{
            for(int i=0;i<10000;i++){
                ct.increment();
                
            }
        };
        

        Runnable obj2 =()->{
            for(int i=0;i<10000;i++){
                ct.increment();
            }
        };

        Thread t1= new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Value is : "+ ct.c);

    }
}


class Counter{
    int c;
    public synchronized void increment(){
        c++;    
    }
}


