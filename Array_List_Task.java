import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student
{
	int id;
	String name;
	float marks;

	Student(int id,String name,float marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public void display()
	{
		System.out.println("id = "+id+", name = "+name+", marks = "+marks);
	}

}

public class Array_List_Task {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

		ArrayList<Student> students = new ArrayList<>();

		int choice;

		while(true)
		{
			System.out.println("\n--- Student Management System ---");
			System.out.println("1. Add Student");
			System.out.println("2. View Students");
			System.out.println("3. Update Student");
			System.out.println("4. Delete Student");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();

			switch(choice)
			{
			case 1:
			{
				System.out.println("enter student id: ");
				int id=scan.nextInt();
				scan.nextLine();
				System.out.println("enter your name");
				String name=scan.nextLine();
				System.out.println("enter your marks");
				float marks=scan.nextFloat();
				students.add(new Student(id,name,marks));
				System.out.println("Student added successfully.");
				break;
			}

			case 2:
			{
				System.out.println("\n--- Student List ---");
				if(students.isEmpty())
				{
					System.out.println("No students found.");
				}
				else
				{
					for(Student s:students)
					{
						s.display();
					}
					System.out.println();
				}
				break;
			}

			case 3:
			{
				System.out.print("Enter Student ID to update: ");
				int updateId=scan.nextInt();
				boolean foundUpdate=false;

				for(Student s:students)
				{
					if(s.id == updateId)
					{
						scan.nextLine();
						System.out.println("enter new name: ");
						s.name = scan.nextLine();
						System.out.println("enter new marks: ");
						s.marks = scan.nextFloat();
						System.out.println("Student updated successfully.");
						foundUpdate = true;
						break;
					}
				}
				if(!foundUpdate)
				{
					System.out.println("Student id not found");
				}
				break;
			}
			
			case 4:
			{
				System.out.print("Enter Student ID to delete: ");
				
				int deleteId=scan.nextInt();
				boolean foundDelete=false;
				
				for (int i = 0; i < students.size(); i++) 
				{
					if(students.get(i).id == deleteId)
					{
						students.remove(i);
						System.out.println("Student deleted successfully.");
                        foundDelete = true;
                        break;
					}
				}
				
				if(!foundDelete)
				{
					System.out.println("Student ID not found.");
				}
				break;
			}
			
			case 5:
			{
				System.out.println("Exiting...Thank you");
				System.exit(0);
				break;
			}
			
			case 6:
			{
				System.out.println("Invalid choice.. Try again.");
			}

		}
	}





	}
}
