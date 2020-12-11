import java.util.*;
public class LargestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
int x,y,z;
System.out.println("enter the value for x:");
x=s.nextInt();
System.out.println("enter the value for y:");
y=s.nextInt();
System.out.println("enter the value for z:");
z=s.nextInt();
if(x>y && x>z) {
	System.out.println("x is largest");	
}
else if(y>x && y>z) {
	System.out.println("y is largest");
}
else
	System.out.println("z is largest");
	}

}
