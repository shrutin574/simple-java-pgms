

import java.util.*;
public class registration {
	String name,gender,hailing_from;
	int age;
	Scanner s=new Scanner(System.in);
	void read()
	{
		System.out.println("Enter your name:");
		name=s.nextLine();
		System.out.println("Enter age:");
		age=s.nextInt();
		System.out.println("Enter gender:");
		gender=s.next();
		System.out.println("Hailing from:");

		hailing_from=s.next();
		hailing_from+=s.nextLine();
	}
	void display()
	{
		System.out.println("Welcome,"+name+"!"+"\n"+"Age:"+age+"\n"+"Gender:"+gender+"\n"+"City:"+hailing_from);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		registration c=new registration();
		c.read();
	    c.display();
	}
	}

