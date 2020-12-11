
public class operation {
	int a=125,b=24,c;
	void add()
	{
		c=a+b;
		System.out.println("result is:"+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("result is:"+c);
		}
	void mul()
	{
		c=a*b;
		System.out.println("result is:"+c);
	}
	void div()
	{
		c=a/b;
		System.out.println("result is:"+c);
	}
	void mod()
	{
		c=a%b;
		System.out.println("result is:"+c);
	}
	public static void main(String args[])
	{
		operation o=new operation();
		o.add();
		o.sub();
		o.mul();
		o.div();
		o.mod();
	}
}
