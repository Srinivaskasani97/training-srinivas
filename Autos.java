import java.io.*;

class Auto {
	String model_name;
	int Auto_width;
	String Auto_height;
	int Auto_weight;
	int Auto_topSpeed;
	int Auto_CC;
	static String company_name;
	
	 String showroom_location;
}

public class Autos
{
	public static void main(String[] args)
	{
		Auto TatapassAuto=new Auto();
		TatapassAuto.model_name="Tata_petrol";
		TatapassAuto.Auto_width=22;
		TatapassAuto.Auto_height="4 feet";
		TatapassAuto.Auto_weight=500;
		TatapassAuto.Auto_topSpeed=80;
		TatapassAuto.company_name="Tata Motors";
		TatapassAuto.showroom_location="Attili";		
		System.out.println("============TatapassAuto details =============");
		System.out.println("model name is : " +TatapassAuto. model_name);
		System.out.println("Auto width  is : " +TatapassAuto.Auto_width);
		System.out.println("Auto height id is : " +TatapassAuto.Auto_height);
		System.out.println("Auto weight is : " +TatapassAuto.Auto_weight);
		System.out.println("Auto company name is : " +TatapassAuto.company_name);
		System.out.println("Auto topspeed is : " +TatapassAuto.Auto_topSpeed);
		System.out.println("showroom location is : " +TatapassAuto.showroom_location);




		Auto MahindratruckAuto=new Auto();
		MahindratruckAuto.model_name="MahindratruckAuto_petrol";
		MahindratruckAuto.Auto_width=35;
		MahindratruckAuto.Auto_height="10 feet";
		MahindratruckAuto.Auto_weight=800;
		MahindratruckAuto.Auto_topSpeed=70;
		MahindratruckAuto.company_name="Mahindra";
		MahindratruckAuto.showroom_location="Tanuku";		
		System.out.println("============MahindratruckAuto details =============");
		System.out.println("model name is : " +MahindratruckAuto. model_name);
		System.out.println("Auto width  is : " +MahindratruckAuto.Auto_width);
		System.out.println("Auto height id is : " +MahindratruckAuto.Auto_height);
		System.out.println("Auto weight is : " +MahindratruckAuto.Auto_weight);
		System.out.println("Auto company name is : " +MahindratruckAuto.company_name);
		System.out.println("Auto topspeed is : " +MahindratruckAuto.Auto_topSpeed);
		System.out.println("showroom location is : " +MahindratruckAuto.showroom_location);
		
		
		
		
	}
}