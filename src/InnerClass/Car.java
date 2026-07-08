package InnerClass;

public class Car {
    String carName;

    public void showCar(){
        System.out.println("hi from Car class");
    }
     class Engine{
        String EngineName;

        public String getEngineName() {
            return EngineName;
        }

        public void setEngineName(String engineName) {
            EngineName = engineName;
        }

        public void showEngine(){
            System.out.println("hi from Engine class");
        }
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
