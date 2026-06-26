package StaticInnerClass;


public class StaticInnerClassExample {
    public static void main() {

        Bus b = new Bus();
        b.setBusName("volvo ZING MSS");
        System.out.println(b.getBusName());
        b.showBus();

        // if inner class is static
        Bus.Engine e1 = new Bus.Engine();
        e1.setEngineName("1.5L");
        System.out.println(e1.getEngineName());
        e1.showEngine();



    }
}
