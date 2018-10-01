
public class PropertyNode 
{
	
	private Property property;
	private PropertyNode next;
	
	public PropertyNode(Property property, PropertyNode next) 
	{
		this.setProperty(property);
		this.setNext(next);
	}

	public Property getProperty() 
	{
		return property;
	}
	public PropertyNode getNext() 
	{
		return next;
	}

	public void setProperty(Property property) 
	{
		this.property = property;
	}
	public void setNext(PropertyNode next) 
	{
		this.next = next;
	}
	
}
