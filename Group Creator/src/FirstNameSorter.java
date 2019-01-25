import java.util.Comparator;

public class FirstNameSorter implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			return s1.getFirst().compareTo(s2.getFirst());
		}
	}
