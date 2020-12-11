
public class result {
int a,b,c,d;

void read()
{
	a=-5+8*6;
	b=(55+9)%9;
	c=20+-3*5/8;
	d=5+15/3*2-8%3;
	System.out.println("result is a=:"+a);
	System.out.println("result is b=:"+b);
	System.out.println("result is c=:"+c);
	System.out.println("result is d=:"+d);

}

public static void main(String args[])
{
result r=new result();
r.read();

}

}
