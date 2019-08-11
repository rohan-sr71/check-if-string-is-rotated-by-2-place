import java.util.*;
import java.lang.*;
import java.io.*;

class Hello 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str4=sc.nextLine();
		while(n>0)
		{
		    n--;
		    String str1=sc.nextLine();
		    String str2=sc.nextLine();
		    String str3="";
		    str3=str1.substring(2,str1.length());
		    str3=str3+str1.substring(0,2);
		    String str5="";
		    str5=str1.substring(str1.length()-2,str1.length());
		    str5=str5+str1.substring(0,str1.length()-2);
		    if(str2.equals(str3) || str2.equals(str5))
		    {
		        System.out.println(1);
		    }
		    else
		    {
		        System.out.println(0);
		    }
		}
	}
}
