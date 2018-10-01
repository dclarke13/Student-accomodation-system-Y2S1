
public class StudentNode 
{
	private Student student;
	private StudentNode next;
	
	public StudentNode(Student student,StudentNode next) 
	{
		this.setStudent(student);
		this.setNext(next);
	}
	
	public Student getStudent() 
	{
		return student;
	}
	public StudentNode getNext() 
	{
		return next;
	}
	
	public void setStudent(Student student) 
	{
		this.student = student;
	}
	public void setNext(StudentNode next) 
	{
		this.next = next;
	}

}
