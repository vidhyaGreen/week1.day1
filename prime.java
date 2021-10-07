package week1assignment;

public class prime {

	public static void main(String[] args) {
int number=13;
boolean flag=false;
for(int i=2;i<=number/2;i++)
{
	if(number % i==0)
	{
		flag= true;
		break;
		}}
	{
		if(!flag)
	System.out.println("the num is prime number");
	else
		System.out.println("the num is not a prime num");
}
}}