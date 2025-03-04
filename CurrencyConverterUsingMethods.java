import java.util.Scanner;
class CurrencyConverterUsingMethods 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Amount in Rs : ");
		float rs=sc.nextFloat();
		rupeeToUsd(rs);
	}
	
	public static void rupeeToUsd(float rupee){
		float usd=rupee/87.15f;
		System.out.println(rupee+" rupee is "+usd+" USD");
				usdToEuro(usd);	
	}
	
	public static void usdToEuro(float usd){
		float euro=usd*1.05f;
		System.out.println(usd+" USD is "+euro+" Euro");
					
	}
	
	
}
