package comparable;

import java.util.TreeSet;

public class TreeStudentComparable {
public static void main(String[] args) {
	TreeSet treeset=new TreeSet();
	Student1 s=new Student1(10,"Ram","Pune");
	Student1 s1=new Student1(30,"Sham","Nashik");
	Student1 s2=new Student1(20,"Krushna","Mumbai");
	treeset.add(s);
	treeset.add(s1);
	treeset.add(s2);
	System.out.println(treeset);
	
}
}
