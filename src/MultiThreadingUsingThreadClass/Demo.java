package MultiThreadingUsingThreadClass;

public class Demo {
    //multithreading where we have 2 threads t1 and t2 doing which are part of the process
    // parts are split and given to 2 threads
    // new -> start -> run -> sleep/wait(handling exception since its a checked exception) -> after program is over thread goes to the dead state;

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
    }


}
