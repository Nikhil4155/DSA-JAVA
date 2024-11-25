import java.util.*;
public class cvowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String st;
		int count=0;
		System.out.println("Enter the String");
		st=sc.nextLine();
		sc.close();
		for(int i=0; i<(st.length()); i++)
		{
			char ch=st.charAt(i);
			if(ch.indexOf('aeiouAEIOU')>=0)
				count+=1;

		}
		System.out.println("The total number of vowels:"+count);
	}
}