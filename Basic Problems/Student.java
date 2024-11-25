class Student
{
	int rno;
	String name;
	float marks;
	
	Student(int rno,String name,float marks)
	{
	   this.rno=rno;
	   this.name=name;
	   this.marks=marks;
	}

	Student()
	{
	   this(14,"Default name",66.0f);
	}

	Student(Student other)
	{
	   this.name=other.name;
	   this.rno=other.rno;
	   this.marks=other.marks;
	}
	void display()
	{
	   System.out.println(this.rno);
	   System.out.println(this.name);
	   System.out.println(this.marks);
	}
}