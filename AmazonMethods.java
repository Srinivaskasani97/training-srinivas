import java.io.*;

class Amazon{
    void items(){
        System.out.println("1.Apple product\n2.fashsion item\n3.home appliances\n4.geocerises");
    }
    void takeItem(String order){
        System.out.println("item ordered is "+order);
    }
    String giveItem(){
        return "macbook";
    }
    int bill(){
        return 155000;
    }
    String payBill(int amount){
    	System.out.print("The bill amount "+amount);
        return "paid";
    }
}
    
class AmazonMethods{
    public static void main(String args[]){
        Amazon shop=new Amazon();
        shop.items();
        shop.takeItem("Macbook");
        System.out.println("Mobile given is: " + shop.giveItem());
        System.out.println("Bill amount is: "+ shop.bill());
        System.out.println(" is " + shop.payBill(shop.bill()));
    }
}