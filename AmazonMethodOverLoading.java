import java.io.*;

class Amazon{
    void items(){
        System.out.println("1.clothes\n2.mobiles\n3.geoceries\n4.Homeappliances");
    }
    void takeItem(String order){
        System.out.println("item ordered is "+order);
    }
    void takeItem(String order1,String order2){
        System.out.println("item ordered is "+order1+" and "+order2);
    }
    void takeItem(String order1,String order2,String order3){
        System.out.println("item Ordered is "+order1+" and "+order2+" and "+order3);
    }
}
            
class AmazonMethodOverLoading{
    public static void main(String args[]){
        Amazon shop=new Amazon();
        shop.items();
        shop.takeItem("geoceries");
        shop.takeItem("geoceries","mobiles");
        shop.takeItem("geoceries","mobiles","clothes");
    }
}