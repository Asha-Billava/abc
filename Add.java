import java.io.*;
import java.lang.*;
class Add
{
	 
	
	public static void main(String args[])throws IOException
	{
		//Add obj=new Add();
		int c,a=50,b=100;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the value for a and b :");
		a=Integer.parseInt(in.readLine());
		b=Integer.parseInt(in.readLine());
		if(a == b)
		{
		System.out.println("both variables are same please give diff values");
		}
		else
		{
		c=a;
		a=b;
		b=c;

		System.out.println("After swaping a number is:"+a+"\t"+b);
		}
		
	
	
	}
}

		
		
		
