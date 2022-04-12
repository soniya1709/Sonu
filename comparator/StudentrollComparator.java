package comparator;

import java.util.Comparator;

public class StudentrollComparator implements Comparator<Student> {
	public int compare(Student s1,Student s2)
	{
		if(s1.roll==s2.roll)
			return 0;
		else if(s1.roll>s2.roll)
			return 2;
		else
			return -4;
	}

}
