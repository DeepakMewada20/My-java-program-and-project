
class X1
{
	int a=67,b=34,c;
	void sum(){
		c=a+b;
		System.out.println("sum of a and b is "+c);
	}
}
class Y1
{
	public static void main(String a[]) 
	{
		X1 x=new X1();
		x.sum();
	}
}