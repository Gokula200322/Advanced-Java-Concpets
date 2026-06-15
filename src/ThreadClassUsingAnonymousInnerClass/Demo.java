package ThreadClassUsingAnonymousInnerClass;

public class Demo {

    public static void main(String[] args) {

        Thread t1  = new Thread(){
            public void run(){
                for(int i =1;i<=10;i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t2  = new Thread(){
            public void run(){
                for(int i =10;i>=1;i--){
                    System.out.println(i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }




}
