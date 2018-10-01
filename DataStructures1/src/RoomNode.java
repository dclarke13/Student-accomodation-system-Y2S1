
public class RoomNode 
{
	private Room room;
	private RoomNode next;
	
	public RoomNode(Room room,RoomNode next) 
	{
		this.setRoom(room);
		this.setNext(next);
	}

	public Room getRoom() 
	{
		return room;
	}
	public RoomNode getNext() 
	{
		return next;
	}

	public void setRoom(Room room) 
	{
		this.room = room;
	}
	public void setNext(RoomNode next) 
	{
		this.next = next;
	}
	
}
