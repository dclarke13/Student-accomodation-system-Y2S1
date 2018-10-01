
public class Room
{
	private int floor;
	private boolean ensuite;
	private String roomID;
	private int beds;
	
	public Room (int floor,boolean ensuite, String roomID, int beds) 
	{
		this.setFloor(floor);
		this.setEnsuite(ensuite);
		this.setRoomID(roomID);
		this.setBeds(beds);
	}
	
	public int getFloor() 
	{
		return floor;
	}
	public boolean isEnsuite() 
	{
		return ensuite;
	}
	public String getRoomID() 
	{
		return roomID;
	}
	public int getBeds() 
	{
		return beds;
	}
	
	public void setFloor(int floor) 
	{
		this.floor = floor;
	}
	public void setEnsuite(boolean ensuite) 
	{
		this.ensuite = ensuite;
	}
	public void setRoomID(String roomID) 
	{
		this.roomID = roomID;
	}
	public void setBeds(int beds) 
	{
		this.beds = beds;
	}
	
	public String toString()
    {
        return "Floor Room is on: " + floor
             + ", Ensuite: " + ensuite;

    }


}
