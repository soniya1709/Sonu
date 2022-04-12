package comparator;

import java.util.TreeSet;

public class TreesetStudentCustom {
public static void main(String[] args) {
	
	StudentrollComparator sortByroll=new StudentrollComparator();
	StudentnameComparator sortByname=new StudentnameComparator();
	StudentcityCompartor sortBycity=new StudentcityCompartor();
	TreeSet treeset=new TreeSet(sortByroll);
	TreeSet treeset1=new TreeSet(sortByname);
	TreeSet treeset2=new TreeSet(sortBycity);
	Student stud1=new Student(10,"Ram","Pune");
	Student stud2=new Student(50,"Sham","Mumbai");
	Student stud3=new Student(20,"Ram","Nashik");
	Student stud4=new Student(40,"Krushna","Nashik");
	treeset.add(stud1);
	treeset.add(stud2);
	treeset.add(stud3);
	treeset.add(stud4);
	treeset1.add(stud1);
	treeset1.add(stud2);
	treeset1.add(stud3);
	treeset1.add(stud4);
	treeset2.add(stud1);
	treeset2.add(stud2);
	treeset2.add(stud3);
	treeset2.add(stud4);
	System.out.println("sorted by rollno ="+treeset);
	System.out.println("sorted by name ="+treeset1);
	System.out.println("sorted by city ="+treeset2);
	
}
}
