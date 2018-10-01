//check list rooms
public class RoomList 
{
	private RoomNode head;
	private RoomNode tail;
	
	public void RoomList() 
	{
		this.head=null;
		this.tail=null;
	}
	
	public RoomNode getHead() 
	{
		return head;
	}
	
	public void addRoom(Room Room) 
	{
		RoomNode newroom = new RoomNode(Room, null);
		if(head == null) 
		{
			head = newroom;
			tail = newroom;
		}
		else
		{
			tail.setNext(newroom);
			tail = newroom;
		}
	}
	
	public void removeRoom(RoomNode roomnode) 
	{
		RoomNode room = head;
		if (roomnode != room)
		{
			while(room.getNext()!=null) 
			{
				if(room.getNext()==roomnode) 
				{
					room.setNext(roomnode.getNext());
				}
				room=room.getNext();
			}
		}
		else 
		{
			head = null;
		}
	}
	
	public String listRooms() 
	{
		String output = "";
		RoomNode roomnode = head;
		if (roomnode != null)
		{
			
			while(roomnode.getNext() != null) 
			{
				output = output +" room ID: " + roomnode.getRoom().getRoomID() +
						", Floor: " + roomnode.getRoom().getFloor() + 
						", Ensuite: " + roomnode.getRoom().isEnsuite() +
						", number of beds: " + roomnode.getRoom().getBeds() + "\n";
				roomnode=roomnode.getNext();
			}
			
			output = output +" room ID: " + roomnode.getRoom().getRoomID() +
					", Floor: " + roomnode.getRoom().getFloor() + 
					", Ensuite: " + roomnode.getRoom().isEnsuite() +
					", number of beds: " + roomnode.getRoom().getBeds() + "\n";
		}
		else 
		{
			output = "No rooms Available";
		}
			
			return output;
	}
	
	public int countRooms()
	{
		int counter =1;
		RoomNode roomnode = head;
		if( roomnode==null)
		{
			counter = 0;
		}
		else
		{
			while(roomnode.getNext() != null)
			{
				roomnode=roomnode.getNext();
				counter++;
			}
		}
			return counter;
	}
}
