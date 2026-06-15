package MultithreadingUsingRunnableInterface;

public class Thread1 implements Runnable{

    Thread1(){
        Thread thread1 = new Thread(this,"Thread1");
        thread1.start();
    }

    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        }catch(Exception e){
            System.out.println("Exception occured "+e.getMessage());
        }
    }
}
