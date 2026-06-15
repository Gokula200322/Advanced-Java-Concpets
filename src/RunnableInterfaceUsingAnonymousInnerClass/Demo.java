package RunnableInterfaceUsingAnonymousInnerClass;


public class Demo {

    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i >= 1; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}
