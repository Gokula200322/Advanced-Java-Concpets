package Enum;

enum Laptop{
    Macbook(2000),Dell(1800),HP(1500),ThinkPad(); // also ThinkPad without () also works

    private int price;

    private Laptop(){
        this.price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class EnumExamples{

    public static void main(String[] args){
        Laptop lap = Laptop.HP;
        lap.setPrice(3000);
        System.out.println(lap.ordinal());
       // Laptop lap2 = new Laptop(5000); //why constructor cannot be public bc defined instances are the only ones we can have thats y constructor is made private to support the design so we cannot instantiate outside of the enum
        System.out.println(lap+" : "+lap.getPrice());

        for(Laptop lap1 : Laptop.values()){
            System.out.println(lap1 +" : "+ lap1.getPrice());

        }

        System.out.println();

        Laptop[] lap1 = Laptop.values();

        System.out.println(lap1[0]);
        System.out.println(lap1[2]);


        for(Laptop l :lap1){
            System.out.println(l +" : "+l.ordinal());
        }
    }

}