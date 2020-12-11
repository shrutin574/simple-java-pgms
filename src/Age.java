import java.util.*;
class Age
{
Scanner s=new Scanner(System.in);
int age;
void read()
{
System.out.println("enter your age:");
age=s.nextInt();
if(age>18)
{
System.out.println("eligible for voting:");
}
else
{
System.out.println("not eligible for voting:");
}
}
public static void main(String args[])
{
Age p=new Age();

Scanner s=new Scanner(System.in);
p.read();
}
}