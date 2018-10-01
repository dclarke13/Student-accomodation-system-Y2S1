import java.util.Scanner;

public class PropertyList 
{
	private PropertyNode head;
	private PropertyNode tail;
	private Scanner input;
	
	public void PropertyList() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public PropertyNode getHead() 
	{
		return head;
	}
	
	public void addProperty(Property property) 
	{
		PropertyNode newProperty = new PropertyNode(property, null);
		if(head == null) 
		{
			head = newProperty;
			tail = newProperty;
		}
		else
		{
			tail.setNext(newProperty);
			tail = newProperty;
		}
	}
	
	public void removeProperty(PropertyNode propertynode) 
	{
		PropertyNode property = head;
		if (propertynode != property)
		{
			while(property.getNext()!=null) 
			{
				if(property.getNext()==propertynode) 
				{
					property.setNext(propertynode.getNext());
				}
				property=property.getNext();
		
			}
		}
		else 
		{
			head = null;
		}
	}
	
	public String listProperty() 
	{
		String output = "";
		PropertyNode propertynode = head;
		if (propertynode != null)
		{
			
			while(propertynode.getNext() != null) 
			{
				output = output +" Property ID: " + propertynode.getProperty().getPropertyID() +
						", Address: " + propertynode.getProperty().getAddress() + 
						", Distance: " + propertynode.getProperty().getDistancekm() +
						", Number of Rooms: " + propertynode.getProperty().getNoRooms() +
						", Number of Parking Spaces: " + propertynode.getProperty().getParkingSpaces()+ "\n";
				propertynode=propertynode.getNext();
			}
			
			output = output +" Property ID: " + propertynode.getProperty().getPropertyID() +
					", Address: " + propertynode.getProperty().getAddress() + 
					", Distance: " + propertynode.getProperty().getDistancekm() +
					", Number of Rooms: " + propertynode.getProperty().getNoRooms() +
					", Number of Parking Spaces: " + propertynode.getProperty().getParkingSpaces()+ "\n";

		}
		else
		{
			output = "No Properties Available";
		}

		return output;
	}

	public int countProperties()
	{
		int counter =1;
		PropertyNode propertynode = head;
		if( propertynode==null)
		{
			counter = 0;
		}
		else
		{
			while(propertynode.getNext() != null)
			{
				propertynode=propertynode.getNext();
				counter++;
			}
		}
			return counter;
	}
	
	
	
}
