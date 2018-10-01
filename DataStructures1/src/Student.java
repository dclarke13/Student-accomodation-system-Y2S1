
public class Student 
{

	private String name;
	private String gender;
	private boolean car;
	private String studentID;
	
	public Student(String name, String gender, boolean car, String studentID) 
	{
		this.setName(name);
		this.setGender(gender);
		this.setCar(car);
		this.setStudentID(studentID);
	}
	
	public String getName() 
	{
		return name;
	}
	public String getGender() 
	{
		return gender;
	}
	public boolean getCar() 
	{
		return car;
	}

	public String getStudentID() 
	{
		return studentID;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public void setCar(boolean car) 
	{
		this.car = car;
	}
	public void setStudentID(String studentID) 
	{
		this.studentID = studentID;
	}
	
	public String toString()
    {
        return "Name: " + name
             + ", Gender: " + gender
             + ", Has Car: " + car
             + ", Student ID: " + studentID;
    }

}
