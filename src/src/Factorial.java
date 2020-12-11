import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
int result=1;
while(num>0) {
	result=result*num;
	num--;
}
System.out.println("factorial of a given number is: "+result);
	}

}
