package MultithreadingUsingRunnableInterface;

public class Thread2 implements Runnable{

    Thread2(){
    Thread thread2 = new Thread(this,"Thread2");
    thread2.start();

    }

    public void run(){
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        }catch(Exception e){
            System.out.println("Exception occured "+e.getMessage());
        }
    }
}
