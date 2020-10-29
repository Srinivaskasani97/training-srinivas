import java.io.*;

class CoffeeShop{
    void menu(){
        System.out.println("1.Blackcoffee\n2.ColdCoffee\n3.Capachino\n4.hotchoclate");
    }
    void takeOrder(String order){
        System.out.println("Order given is "+order);
    }
    void takeOrder(String order1,String order2){
        System.out.println("Order given is "+order1+" and "+order2);
    }
    void takeOrder(String order1,String order2,String order3){
        System.out.println("Order given is "+order1+" and "+order2+" and "+order3);
    }
}
    
class CoffeeShopMethodOverLoading{
    public static void main(String args[])
    {
        CoffeeShop coffe=new CoffeeShop();
        coffe.menu();
        coffe.takeOrder("Capachino");
        coffe.takeOrder("Capachino","Blackcoffee");
        coffe.takeOrder("Capachino","Blackcoffee","ColdCoffee");
    }
}