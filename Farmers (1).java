import java.io.*;
import java.util.*;
class Farmer{
        String farmer_name;
        float land;
        int money_spend;
        static int yeildintons;
        int labour_money;
        String crop;
        String qualityofseeds;
        static String profitorloss;
}
public class Farmers{
    public static void main(String args[]){
        Farmer ramu= new Farmer();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ramu feild details\n");
	System.out.print("Enter farmer name:");
        ramu.farmer_name = sc.next();
	System.out.print("\nEnter farmer land:");
        ramu.land = sc.nextFloat();
	System.out.print("\nEnter money spend:");
        ramu.money_spend = sc.nextInt();
	System.out.print("\nEnter labour money:");
        ramu.labour_money = sc.nextInt();
	System.out.print("\nEnter crop name:");
        ramu.crop = sc.next();
	System.out.print("\nEnter quality of seeds:");
        ramu.qualityofseeds = sc.next();
	System.out.print("\nEnter profit or loss:");
        Farmer.profitorloss = sc.next();
	System.out.print("\nEnter Yeild in tons:");
        Farmer.yeildintons = sc.nextInt();
        System.out.println("Farmer name ="+ramu.farmer_name);
        System.out.println("Farmer land ="+ramu.land);
        System.out.println("Farmer money_spend ="+ramu.money_spend);
        System.out.println("Farmer labour_money ="+ramu.labour_money);
        System.out.println("Farmer crop ="+ramu.crop);
        System.out.println("Farmer quality of seeds ="+ramu.qualityofseeds);
        System.out.println("College name ="+Farmer.profitorloss);
        System.out.println("yeild in tons ="+Farmer.yeildintons + "\n");

        Farmer ravi= new Farmer();
	System.out.println("Enter ravi feild details\n");
	System.out.print("Enter farmer name:");
        ravi.farmer_name = sc.next();
	System.out.print("\nEnter farmer land:");
        ravi.land = sc.nextFloat();
	System.out.print("\nEnter money spend:");
        ravi.money_spend = sc.nextInt();
	System.out.print("\nEnter labour money:");
        ravi.labour_money = sc.nextInt();
	System.out.print("\nEnter crop name:");
        ravi.crop = sc.next();
	System.out.print("\nEnter quality of seeds:");
        ravi.qualityofseeds = sc.next();
	System.out.print("\nEnter profit or loss:");
        Farmer.profitorloss =sc.next();
	System.out.print("\nEnter Yeild in tons:");
        Farmer.yeildintons = sc.nextInt();
        System.out.println("Farmer name ="+ramu.farmer_name);
        System.out.println("Farmer land ="+ramu.land);
        System.out.println("Farmer money_spend ="+ramu.money_spend);
        System.out.println("Farmer labour_money ="+ramu.labour_money);
        System.out.println("Farmer crop ="+ramu.crop);
        System.out.println("Farmer quality of seeds ="+ramu.qualityofseeds);
        System.out.println("College name ="+Farmer.profitorloss);
        System.out.println("Yeild in tons="+Farmer.yeildintons);

    }
}