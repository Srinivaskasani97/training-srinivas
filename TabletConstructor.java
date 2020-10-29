import java.io.*;

class Tablet{
    String ram;
    String hard_disk;
    int Cameras;
    int display;
    String company_name;
    int charger_capacity;
    String graphiccard;
    Tablet(String ram,String hard_disk,int Cameras,int display,String company_name,int charger_capacity,String graphiccard){
        this.ram=ram;
        this.hard_disk=hard_disk;
        this.Cameras=Cameras;
        this.display=display;
        this.company_name=company_name;
        this.charger_capacity=charger_capacity;
        this.graphiccard=graphiccard;
        this.display();
    }
    void display(){
        System.out.println("============Tablet Details===========");
        System.out.println("Company Name = " + company_name);
        System.out.println("Ram = " + ram);
        System.out.println("Hard_disk = " + hard_disk);
        System.out.println("No of rare cameras = " + Cameras);
        System.out.println("No of front cameras = " + charger_capacity);
        System.out.println("Tablet graphiccard = "+ graphiccard);
        System.out.println("Tablet Display in inches = " + display);
    }
}
    
public class TabletConstructor{
    public static void main(String args[]){
        Tablet Redmi=new Tablet("6GB","128GB",1,7,"Samsung Tablet",25,"2gb graphic card");
        Tablet oneplus=new Tablet("8GB","256GB",2,8,"Apple Tablet",10,"1gb graphic card");
    }
}