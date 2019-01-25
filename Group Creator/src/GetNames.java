import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GetNames
	{
		static ArrayList<Student> fullClass = new ArrayList<Student>();
		static ArrayList<Student> group1 = new ArrayList<Student>();
		static ArrayList<Student> group2 = new ArrayList<Student>();
		static ArrayList<Student> group3 = new ArrayList<Student>();
		static ArrayList<Student> group4 = new ArrayList<Student>();
		static ArrayList<Student> group5 = new ArrayList<Student>();
		static ArrayList<Student> group6 = new ArrayList<Student>();
		static ArrayList<Student> group7 = new ArrayList<Student>();
		static ArrayList<Student> group8 = new ArrayList<Student>();
		static ArrayList<Student> group9 = new ArrayList<Student>();
		static ArrayList<Student> group10 = new ArrayList<Student>();
		static ArrayList<Student> group11 = new ArrayList<Student>();
		
		
		static int numberOfGroups;
		static int groupSize;
		static int remainder;
		static int largeGroup;
		static int smallGroup;
		static int totalGroups;
		public static void greet()
		{
			System.out.println("How many groups would you like?");
			Scanner userInput = new Scanner(System.in);
			numberOfGroups = userInput.nextInt();

			
			
		}
		
		public static void getNames() throws IOException
		{
			int num=1;
			Scanner names = new Scanner (new File ("names.txt"));
			while (names.hasNext())
				{
					ArrayList<String> filler = new ArrayList<String>();
					String one = names.next();
					String two = names.next();
					fullClass.add(new Student(one, two, filler, num));
					num++;
				
				}
			Collections.sort(fullClass, new FirstNameSorter());
			
			groupSize =  fullClass.size()/numberOfGroups;
			remainder = fullClass.size() - (groupSize*numberOfGroups);
			largeGroup = remainder;
			smallGroup = numberOfGroups-remainder;
//			System.out.println("Remainder: " + remainder);
//			System.out.println("Group size: " + groupSize);
			System.out.println("There will be " + remainder + " groups with " + (groupSize+1) + " students. There will be " + (numberOfGroups-remainder) + " groups with " + (groupSize) +" students.");
			
//			for(int i =0; i<fullClass.size();i++)
//				{
//					System.out.println(fullClass.get(i).getFirst()+ " " + fullClass.get(i).getLast() + " "+ fullClass.get(i).getNumber());
//				}
		}
		
		public static void randomizeGroups()
			{
				for (int i=0; i<fullClass.size();i++)
					{
						
					}
		
			}
		
		
		

	}
