import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addStudentsTest {

	@Test
	void test() {
		StudentList studentlist = new StudentList();
		Student one = new Student("one","male",true,"01");
		studentlist.addStudent(one);
		Student two = new Student("two","female",false,"02");
		studentlist.addStudent(two);
		Student three = new Student("three","male",false,"03");
		studentlist.addStudent(three);
		Student four = new Student("four","female",true,"04");
		studentlist.addStudent(four);
		System.out.println(studentlist.listStudent());
	}

}
