package comparable;

public class Student1 implements Comparable<Student1>{

	int roll;
	String name;
	String city;
	public Student1()
	{
		
	}
	public Student1(int roll,String name,String city)
	{
		this.roll=roll;
		this.name=name;
		this.city=city;
	}
	public String toString()
	{
		return roll+ " "+name+ " "+city;
	}
	public int compareTo(Student1 s1)
	{
		return s1.name.compareTo(this.name);
	}
}
