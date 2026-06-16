package Enum;

enum MobilePhone{
    iPhone(1500),samsung(1300),nokia(800),blackberry,nothingPhone(900);

    private int price;
    private MobilePhone() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private MobilePhone(int price){
        this.price = price;
    }


}
public class EnumIfAndSwitch {
    public static void main() {

        MobilePhone mp = MobilePhone.samsung;
        if(mp==MobilePhone.iPhone){
           System.out.println(mp +" recieved if-else");
        }else if(mp == MobilePhone.blackberry){
            System.out.println(mp +" recieved if-else");
        }else if(mp == MobilePhone.nokia){
            System.out.println(mp + " recieved if-else");
        }else if(mp == MobilePhone.nothingPhone){
            System.out.println(mp + " recieved if-else");
        }else{
            System.out.println(mp+" recieved if-else");
        }

        switch(mp){
            case iPhone : System.out.println(mp +" recieved switch");
            break;
            case samsung: System.out.println(mp +" recieved switch");
            break;
            case nokia: System.out.println(mp +" recieved switch");
            break;
            case nothingPhone: System.out.println(mp +" recieved switch");
            break;
            default : System.out.println(mp +" recieved switch");
            break;
        }
    }

}
