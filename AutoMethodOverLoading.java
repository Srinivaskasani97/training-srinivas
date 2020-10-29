import java.io.*;

class AutoShowRoom{
    void listAutos(){
        System.out.println("1.Tatamotors\n2.Mahindra\n3.hitachi\n4.Maruti Suzuki");
    }
    void takeAuto(String order){
        System.out.println("item ordered is "+order);
    }
    void takeAuto(String order1,String order2){
        System.out.println("item ordered is "+order1+" and "+order2);
    }
    void takeAuto(String order1,String order2,String order3){
        System.out.println("item Ordered is "+order1+" and "+order2+" and "+order3);
    }
}
    
class AutoMethodOverLoading{
    public static void main(String args[]){
        AutoShowRoom Autos=new AutoShowRoom();
        Autos.listAutos();
        Autos.takeAuto("Tatamotors");
        Autos.takeAuto("Tatamotors","Mahindra");
        Autos.takeAuto("Tatamotors","Mahindra","hitachi");
    }
}
    