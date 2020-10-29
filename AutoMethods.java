import java.io.*;

class AutoShowRoom{
    void listAutos(){
    System.out.println("1.mahindra\n2.tata motors\n3.hitachi\n4.Maruti Suzuki");
    }
    void takeAuto(String order){
        System.out.println("Auto ordered is "+order);
    }
    String giveAuto(){
        return "Tata";
    }
    int bill(){
        return 350000;
    }
    String payBill(int amount){
        System.out.print("The bill amount "+amount);
        return "paid";
    }
}
    
class AutoMethods{
    public static void main(String args[]){
        AutoShowRoom Autos=new AutoShowRoom();
        Autos.listAutos();
        Autos.takeAuto("tata");
        System.out.println("Auto given is: " + Autos.giveAuto());
        System.out.println("Bill amount is: "+ Autos.bill());
        System.out.println(" is " + Autos.payBill(Autos.bill()));
    }
}