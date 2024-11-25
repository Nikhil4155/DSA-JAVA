public class practice
{
	public static void main(String args[])
   	{
		Student s1=new Student(69,"Nikhil Sah",99.0f);
		Student s2=new Student();
		Student s3=new Student(25,"Rahul",98.0f);
		Student s4=new Student(s3);
		s1.display();
		s2.display();
		s3.display();
		s4.display();		
		
	}
}

