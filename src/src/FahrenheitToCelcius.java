import java.util.*;
public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the temp in fahrenheit");
int temp=s.nextInt();
temp=((temp-32)*5)/9;
System.out.println("temp in celcius= " +temp);
	}

}
