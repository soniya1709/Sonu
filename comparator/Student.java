package comparator;
public class Student  {

	int roll;
	String name;
	String city;
	public Student()
	{
		
	}
	public Student(int roll,String name,String city)
	{
		this.roll=roll;
		this.name=name;
		this.city=city;
	}
	public String toString()
	{
		return roll+ " "+name+ " "+city;
	}
	
}

