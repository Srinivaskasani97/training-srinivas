import java.io.*;
import java.util.*;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the passenger Auto details:\n");
		System.out.print("Enter Model Name:");
		TatapassAuto.model_name=sc.next();
		System.out.print("\nEnter Auto Width:");
		TatapassAuto.Auto_width=sc.nextInt();
		System.out.print("\nEnter Auto Height:");
		TatapassAuto.Auto_height=sc.next();
		System.out.print("\nEnter Auto Weight:");
		TatapassAuto.Auto_weight=sc.nextInt();
		System.out.print("\nEnter Auto Top speed:");
		TatapassAuto.Auto_topSpeed=sc.nextInt();
		System.out.print("\nEnter Auto Comapany Name:");
		TatapassAuto.company_name=sc.next();
		System.out.print("\nEnter Location:");
		TatapassAuto.showroom_location=sc.next();		
		System.out.println("============TatapassAuto details =============");
		System.out.println("model name is : " +TatapassAuto. model_name);
		System.out.println("Auto width  is : " +TatapassAuto.Auto_width);
		System.out.println("Auto height id is : " +TatapassAuto.Auto_height);
		System.out.println("Auto weight is : " +TatapassAuto.Auto_weight);
		System.out.println("Auto company name is : " +TatapassAuto.company_name);
		System.out.println("Auto topspeed is : " +TatapassAuto.Auto_topSpeed);
		System.out.println("showroom location is : " +TatapassAuto.showroom_location);




		Auto MahindratruckAuto=new Auto();
		
		System.out.println("Enter the Truck Auto details:\n");
		System.out.print("Enter Model Name:");
		MahindratruckAuto.model_name=sc.next();
		System.out.print("\nEnter Auto Width:");
		MahindratruckAuto.Auto_width=sc.nextInt();
		System.out.print("\nEnter Auto Height:");
		MahindratruckAuto.Auto_height=sc.next();
		System.out.print("\nEnter Auto Weight:");
		MahindratruckAuto.Auto_weight=sc.nextInt();
		System.out.print("\nEnter Auto Top speed:");
		MahindratruckAuto.Auto_topSpeed=sc.nextInt();
		System.out.print("\nEnter Auto Comapany Name:");
		MahindratruckAuto.company_name=sc.next();
		System.out.print("\nEnter Location:");
		MahindratruckAuto.showroom_location=sc.next();		
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