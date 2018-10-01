import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addRoomsTest {

	@Test
	void test() {
		RoomList roomlist = new RoomList();
		Room one = new Room(1, true, "01", 2);
		roomlist.addRoom(one);
		Room two = new Room(3, false, "02", 1);
		roomlist.addRoom(two);
		Room three = new Room(2, true, "03", 3);
		roomlist.addRoom(three);
		Room four = new Room(5, false, "04", 5);
		roomlist.addRoom(four);
		System.out.println(roomlist.listRooms());
	}

}
