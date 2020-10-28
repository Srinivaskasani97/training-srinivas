import java.io.*;

class Farmer{
        String farmer_name;
        float land;
        float money_spend;
        static int yeildintons;
        int labour_money;
        String crop;
        String qualityofseeds;
        static String profitorloss;
}
public class Farmers{
    public static void main(String args[]){
        Farmer ramu= new Farmer();
        ramu.farmer_name = "Ramu";
        ramu.land = 5.36f;
        ramu.money_spend = 50000.0f;
        ramu.labour_money = 5000;
        ramu.crop = "rice";
        ramu.qualityofseeds = "Basmathi";
        Farmer.profitorloss = "Profit";
        Farmer.yeildintons = 300;
        System.out.println("Farmer name ="+ramu.farmer_name);
        System.out.println("Farmer land ="+ramu.land);
        System.out.println("Farmer money_spend ="+ramu.money_spend);
        System.out.println("Farmer labour_money ="+ramu.labour_money);
        System.out.println("Farmer crop ="+ramu.crop);
        System.out.println("Farmer quality of seeds ="+ramu.qualityofseeds);
        System.out.println("College name ="+Farmer.profitorloss);
        System.out.println("yeild in tons ="+Farmer.yeildintons + "\n");

        Farmer Ravi= new Farmer();
        ramu.farmer_name = "Ramu";
        ramu.land = 3.36f;
        ramu.money_spend = 30000.0f;
        ramu.labour_money = 2000;
        ramu.crop = "Wheat";
        ramu.qualityofseeds = "first Grade";
        Farmer.profitorloss = "Loss";
        Farmer.yeildintons = 130;
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