package MultithreadingUsingRunnableInterface;

public class Demo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        //Thread th1 = new Thread(t1);
        //Thread th2 = new Thread(t2);
        //th1.start();
        //th2.start();
        // removing the constructor as we are calling the start here
        // alternative way of calling threads using runnable interface
        // another way to create a thread obj and pass the thread class usage obj
        // inside the thread obj and then call start.



    }
}
