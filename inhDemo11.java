//inheritance demo

class Student
{
	private int roll;
	private String name;
	private int marks1;
	private  int marks2;
	protected float totalMarks;
	private static int counter=1;
	public Student(){}
	public Student(String name,int marks1,int marks2)
	{
		this.roll=Student.counter++;
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.totalMarks=marks1+marks2;
	}
	public int getRoll(){return roll;}
	public String getName(){return name;}
	public void setName(String name){this.name=name;}
	public float getTotalMarks(){return totalMarks;}
	public void setTotalMarks(Float marks){this.totalMarks=marks;}

	public void displayStudentInfo()
	{
		System.out.println("Roll Number : "+roll);
		System.out.println("Student Name : "+name);
		System.out.println("Marks1 : "+marks1);
		System.out.println("Marks2 : "+marks2);
		System.out.println("Total Marks : "+totalMarks);

	}
}

class SportStudent extends Student
{
	private String sportName;
	
	public SportStudent(String name,int marks1,int marks2,String sportName)
	{
		super(name,marks1,marks2);
		this.sportName=sportName;
		this.totalMarks=this.totalMarks+10;
		//setTotalMarks(getTotalMarks()+10);

	}
	public String getSportName(){return sportName;}
	public void setSportName(String sportName){this.sportName=sportName;}
}

class Tester
{
	public static void main(String s[])
	{
		SportStudent ss1=new SportStudent("Ashish",70,80,"FootBall");
		ss1.displayStudentInfo();
		System.out.println("Sports Name : "+ss1.getSportName());
	}
}

		

	