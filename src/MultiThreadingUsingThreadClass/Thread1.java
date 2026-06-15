package MultiThreadingUsingThreadClass;

public class Thread1 extends Thread {

    Thread1(){
        start();
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
