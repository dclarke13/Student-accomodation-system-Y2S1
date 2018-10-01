import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addPropertiesTest 
{

	@Test
	void test() 
	{
		PropertyList propertylist = new PropertyList();
		Property one = new Property("25 wellings avenue", 5.5, 1, 3,"01");
		propertylist.addProperty(one);
		Property two = new Property("37 stevenson street", 3.2, 4, 5,"02");
		propertylist.addProperty(two);
		Property three = new Property("534 rocket way", 6.7, 3, 5,"03");
		propertylist.addProperty(three);
		Property four = new Property("25 wellings avenue", 1.2, 0, 3,"04");
		propertylist.addProperty(four);
	
		System.out.println(propertylist.listProperty());
	}

}
