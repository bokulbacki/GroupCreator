import java.util.ArrayList;

public class Student
	{
		private String first;
		private String last;
		private ArrayList<String> previousPartners;
		private int number;
		
		public Student (String f, String l, ArrayList<String> p, int n)
		{
			first=f;
			last=l;
			previousPartners=p;
			number=n;
		}

		public int getNumber()
			{
				return number;
			}

		public void setNumber(int number)
			{
				this.number = number;
			}

		public String getFirst()
			{
				return first;
			}

		public void setFirst(String first)
			{
				this.first = first;
			}

		public String getLast()
			{
				return last;
			}

		public void setLast(String last)
			{
				this.last = last;
			}

		public ArrayList<String> getPreviousPartners()
			{
				return previousPartners;
			}

		public void setPreviousPartners(ArrayList<String> previousPartners)
			{
				this.previousPartners = previousPartners;
			}
		
		
	}
