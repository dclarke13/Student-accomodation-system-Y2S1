
public class StudentList 
{
	private StudentNode head;
	private StudentNode tail;
	
	public void StudentList() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public StudentNode getHead() 
	{
		return head;
	}
	
	public void addStudent(Student student) 
	{
		StudentNode newStudent = new StudentNode(student, null);
		if(head == null) 
		{
			head = newStudent;
			tail = newStudent;
		}
		else
		{
			tail.setNext(newStudent);
			tail = newStudent;
		}
	}
	
	public void removeStudent(StudentNode studentnode) 
	{
		StudentNode student = head;
		if (studentnode != student)
		{
			while(student.getNext()!=null) 
			{
				if(student.getNext()==studentnode) 
				{
					student.setNext(studentnode.getNext());
				}
				student=student.getNext();
		
			}
		}
		else 
		{
			head = null;
		}
	}
	
	public String listStudent() 
	{
		String output = "";
		StudentNode studentnode = head;
		if (studentnode != null)
		{
			
			while(studentnode.getNext() != null) 
			{
				output = output +" Student ID: " + studentnode.getStudent().getStudentID() +
						" Name: " + studentnode.getStudent().getName() + 
						" Has Car: " + studentnode.getStudent().getCar() +
						" Gender: " + studentnode.getStudent().getGender() + "\n";
				studentnode=studentnode.getNext();
			}
			
			output = output +" Student ID: " + studentnode.getStudent().getStudentID() +
					" Name: " + studentnode.getStudent().getName() + 
					" Has Car: " + studentnode.getStudent().getCar() +
					" Gender: " + studentnode.getStudent().getGender() + "\n";
		}
		else 
		{
			output = "No Students Available";
		}
			
			return output;
	}

	public int countStudents()
	{
		int counter =1;
		StudentNode studentnode = head;
		if( studentnode==null)
		{
			counter = 0;
		}
		else
		{
			while(studentnode.getNext() != null)
			{
				studentnode=studentnode.getNext();
				counter++;
			}
		}
			return counter;
	}
}
