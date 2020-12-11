

import java.text.DecimalFormat;
import java.util.*;
public class car {
	String car_name,car_no;
	Double price;
	Scanner s=new Scanner(System.in);
	void read()
	{
		System.out.println("enter the car name:");
		car_name=s.next();
		System.out.println("enter the car no:");
		car_no=s.next();
		System.out.println("enter the price:");
		price=s.nextDouble();
		
		
	}
	void display()
	{
		DecimalFormat f=new DecimalFormat("##.00");
		System.out.printf("carname:"+car_name);
		System.out.println("\n"+"carno:"+car_no);
		System.out.println("price:"+f.format(price)+" rs only");
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		car c=new car();
		c.read();
	    c.display();
	}
	}

