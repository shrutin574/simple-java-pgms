
import java.util.*;
public class sqrt {
	public static void main(String args[])
	{
		float n,sqroot,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextFloat();
		if(n<0)
		{
			System.out.println("the sqrt of -ve no cannot be determined");
		}
		else
		{
		sqroot=n/2;
		temp=0;
		while(sqroot!=temp)
		{
			temp=sqroot;
			sqroot=(n/sqroot+sqroot)/2;
		}
		System.out.println("sqroot is:" +sqroot);
		
	}
}
}
