import java.io.*;

class CoffeShop{
    void menu(){
        System.out.println("1.Black coffe\n2.cold coffe\n3.capichino\n4.hot choclate");
    }
    void takeOrder(String order){
        System.out.println("Order given is "+order);
    }
    String serveOrder(){
        return "hot chocalate";
    }
    int bill(){
        return 145;
    }
    String payBill(int amount){
        System.out.print("The bill amount "+amount);
        return "paid";
    }
}
    
class CoffeShopMethods{
    public static void main(String args[]){
        CoffeShop runway9=new CoffeShop();
        runway9.menu();
        runway9.takeOrder("hot chocalate");
        System.out.println("Order Served is: " + runway9.serveOrder());
        System.out.println("Bill amount is: "+ runway9.bill());
        System.out.println(" is " + runway9.payBill(runway9.bill()));
    }
}