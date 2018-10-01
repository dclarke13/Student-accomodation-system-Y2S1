
public class Property 
{
	private String address;
	private double distancekm;
	private int parkingSpaces;
	private int noRooms;
	private String propertyID;
	
	
	public Property(String address,double distance,int parkingSpaces,int noRooms, String propertyID) 
	{
		this.setAddress(address);
		this.setDistancekm(distance);
		this.setParkingSpaces(parkingSpaces);
		this.setNoRooms(noRooms);
		this.setPropertyID(propertyID);
	}
	
	public String getAddress() 
	{
		return address;
	}
	public double getDistancekm() 
	{
		return distancekm;
	}
	public int getParkingSpaces() 
	{
		return parkingSpaces;
	}
	public int getNoRooms() 
	{
		return noRooms;
	}
	public String getPropertyID() 
	{
		return propertyID;
	}
	
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public void setDistancekm(double distancekm) 
	{
		this.distancekm = distancekm;
	}
	public void setParkingSpaces(int parkingSpaces) 
	{
		this.parkingSpaces = parkingSpaces;
	}
	public void setNoRooms(int noRooms) 
	{
		this.noRooms = noRooms;
	}
	public void setPropertyID(String roomID) 
	{
		this.propertyID = roomID;
	}
	
	public String toString()
    {
        return "Address: " + address
             + ", Distance to WIT: " + distancekm
             + ", No. Parking Spaces Available: " + parkingSpaces
             + ", No. Rooms Available: " + noRooms;
    }








	
	

	
}
