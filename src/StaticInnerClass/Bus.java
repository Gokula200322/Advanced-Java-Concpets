package StaticInnerClass;

public class Bus {
    String BusName;

    public void showBus(){
        System.out.println("hi from Bus class");
    }
    static class Engine{
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

    public String getBusName() {
        return BusName;
    }

    public void setBusName(String BusName) {
        this.BusName = BusName;
    }
}

