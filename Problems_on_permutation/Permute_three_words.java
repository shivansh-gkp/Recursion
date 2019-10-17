import java.util.*;
public class permute {
	static char arr1[]= new char[4];
	static char arr2[]= new char[1];
	static char arr3[]= new char[1];
	static int key1=0;
	static int key2=0;
	static int counter=0;
	static boolean contains(char arr[], char k)
	{
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				return true;
			}	
		}
		return false;
	}
	static String permute(String s1,String s2,String s3,int a, int b, int c )
	{
	//	System.out.println("a="+a+" b= "+b + " c="+c);
		int i=0;
		if((a==arr1.length)&&(b==arr2.length)&&(c==arr3.length))
		{
			for(i=0;i<arr1.length;i++)
			{
				System.out.print(arr1[i]+" ");
			}
			for(i=0;i<arr2.length;i++)
			{
				System.out.print(arr2[i]+" ");
			}
			for(i=0;i<arr3.length;i++)
			{
				System.out.print(arr3[i]+" ");
			}
			counter++;
			System.out.println();
			return "";
		}
	//	if((b<=a)&&(c<=b))
		//{
		for(i=0;i<s1.length();i++)
		{
			//System.out.println(s1.charAt(i)+" " +contains(arr1,s1.charAt(i)) );
			//System.out.println("a="+a+" b= "+b + " c="+c);
			if((contains(arr1,s1.charAt(i))!= true)&&(a<arr1.length))
			{
				//System.out.println("a="+a+" b= "+b + " c="+c);
				arr1[a]=s1.charAt(i);
				permute(s1,s2,s3,a+1,b,c);
				arr1[a]=' ';
			}
			//System.out.println("a="+a+" b= "+b + " c="+c);
			if((contains(arr2,s2.charAt(i))!= true)&&(b<arr2.length)&&(a==arr1.length))
			{
				//System.out.println("a="+a+" b= "+b + " c="+c);
				arr2[b]=s2.charAt(i);
				permute(s1,s2,s3,a,b+1,c);
			    arr2[b]=' ';
			//	System.out.println("b= "+arr2[b]);
			}
		//	System.out.println("a="+a+" b= "+b + " c="+c);
			if((contains(arr3,s3.charAt(i))!= true)&&(c<arr3.length)&&(b==arr2.length))
			{
			//	System.out.println("a="+a+" b= "+b + " c="+c);
				arr3[c]=s3.charAt(i);
				permute(s1,s2,s3,a,b,c+1);
				arr3[c]=' ';
			}
		}
		
		return "";
	}
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter 3 words");
	String s1= sc.nextLine();
	String s2= sc.nextLine();
	String s3= sc.nextLine();
	int l1= s1.length();
	int l2= s2.length();
	int l3= s3.length();
	String ans= permute(s1,s2,s3,0,0,0);
	System.out.println(counter);
	
	}
}

