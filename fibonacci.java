package week1assignment;

public class fibonacci {

	public static void main(String[] args) {
		int firstnum=0;
	    int secondnum=1;
		int range=8;
		int sum;
		System.out.println("fibonacci series");
		System.out.println(firstnum);
		System.out.println(secondnum);
		for(int i=1;i<range-1;i++)
		{
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);
		}}}
		