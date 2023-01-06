//object creation and function calling in java
class X1
{
	int a=67,b=34,c;//initilisetion of veriabal
	void sum(){     //creation of function
		c=a+b;
		System.out.println("sum of a and b is "+c);
	}
}
class Y1
{
	public static void main(String a[]) 
	{
		X1 x=new X1();//creation of object
		x.sum();	  //calling of function of class X1
	}
}