package InnerClass;

public class innerClassExample {
    public static void main() {

        Car c = new Car();
        c.setCarName("maruthi suzuki");
        System.out.println(c.getCarName());
        c.showCar();

        //if inner class is not static
        Car.Engine e1 = new Car().new Engine();
        Car.Engine e2 = c.new Engine();
        e1.setEngineName("1.5L turbo");
        e2.setEngineName(e1.getEngineName());
        System.out.println(e1.getEngineName());
        System.out.println(e2.getEngineName());
        e1.showEngine();
        e2.showEngine();




    }
}
