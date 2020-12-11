import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
int remainder,result=0;
while(num>0) {
	remainder=num%10;
	result=result*10+remainder;
	num=num/10;
}
System.out.println("reverse number is: "+result);
	}

}
