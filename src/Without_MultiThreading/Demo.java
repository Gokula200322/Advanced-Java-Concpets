package Without_MultiThreading;

public class Demo {
    // sequential without multithreading ie parallelsim
    // this whole is a process or program running inside the memory
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >=1 ; i--) {
            System.out.println(i);
        }
    }
}
