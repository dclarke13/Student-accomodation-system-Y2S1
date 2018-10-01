/*Darren Clarke
 * 20074525
 * Data Structures project one
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
	private Scanner input;
	private PropertyList propertylist;
	private RoomList roomlist;
	private StudentList studentlist;
	//read student csv using scanner
	private String studentfile = "students.csv";
	private Scanner studentread;
	//read property csv using scanner
	private String propertyfile = "properties.csv";
	private Scanner propertyread;
	//read room csv using scanner
	private String roomfile = "rooms.csv";
	private Scanner roomread;
	
    public static void main(String[] args) 
    {
		Driver app = new Driver();
	}
    
    public Driver()
    {
        propertylist = new PropertyList();
        roomlist = new RoomList();
        studentlist = new StudentList();
        loadStudents();
        loadProperties();
        loadRooms();
        runMainMenu();
    }
    
    
    //display the main menu options
    private int mainMenu()
    { 
        System.out.println("** Student Accomodation Menu **");
        System.out.println("---------");     
        System.out.println("  1) Property Options");    
        System.out.println("  2) Student Options");    
        System.out.println("  3) Room Options"); 
        System.out.println("  4) Add a Student");
        System.out.println("  5) List Rooms"); 
        System.out.println("  6) Search for Bed"); 
        System.out.println("---------");         
        System.out.println("  0) Exit");
        System.out.print("==>> ");
        int option = input.nextInt();
        return option;
    }

    
    //run the main menu
   private void runMainMenu()
   {
       int option = mainMenu();
       while (option != 0)
       {
          
           switch (option)
           {
              case 1:    runPropertyMenu();
           	             break;
              case 2:    runStudentMenu();
                         break;
              case 3:    runRoomMenu();
                         break;
              case 4:    System.out.println ("not currently an option");
              			 break;
              case 5:    System.out.println ("not currently an option");
            	  		 //runGameMenu();
              			 break;              
              case 6:    System.out.println ("not currently an option");
                         break;
              case 7:    System.out.println ("not currently an option");
                         break;
              case 8:    System.out.print ("not currently an option");
                         break;
             default:    System.out.println("Invalid option entered: " + option);
                         break;
           }
           
           System.out.println("\nPress any key to continue...");
           input.nextLine();
           input.nextLine();
           
           
           option = mainMenu();
       }
      
       //if option 0 is picked exit
       System.out.println("Exiting...");
       System.exit(0);
   }
   
   //display the property menu
   private int propertyMenu()
   { 
       System.out.println("Property Menu");
       System.out.println("---------");    
       System.out.println("  1) add property");        
       System.out.println("  2) list property ");      
       System.out.println("  3) remove property");
       System.out.println("  4) Search property by ID");
       System.out.println("  5) Search property by address");
       System.out.println("  6) Search property by minimum number of parking spaces");
       System.out.println("  7) Search property by minimum number of rooms");
       System.out.println("  8) Search property by maximum distance from WIT");
       System.out.println("---------");         
       System.out.println("  0) Main Menu");
       System.out.print("==>> ");
       int selection = input.nextInt();
       return selection;
   }
	   
   
   //run the property menu
   private void runPropertyMenu()
   {
       int option =propertyMenu();
      
           switch (option)
           {
              case 1:    addProperty();
           	             break;
              case 2:    System.out.println(propertylist.listProperty());
                         break;
              case 3:    removeProperty();
              			 break;
              case 4:    searchPropertyID();
   			 			 break;
              case 5:    searchPropertyAddress();
   			 			 break;
              case 6:    searchPropertyMinSpaces();
	 			 		 break;
              case 7:    searchPropertyMinRooms();
		 		 		 break;
              case 8:    searchPropertyMaxDistance();
		 		 		 break;
              case 0:    runMainMenu();
              			 break;
             default:    System.out.println("Invalid option entered: " + option);
                         break;
           }
           
           System.out.println("\nPress any key to continue...");
           input.nextLine();  
           //display the menu again
           runPropertyMenu();
    }
   
   //display student menu options
   private int studentMenu()
   { 
       System.out.println("student Menu");
       System.out.println("---------");    
       System.out.println("  1) add student");        
       System.out.println("  2) list students ");      
       System.out.println("  3) delete student"); 
       System.out.println("  4) search student by ID");    
       System.out.println("  5) search student by name");
       System.out.println("---------");         
       System.out.println("  0) main menu");
       System.out.print("==>> ");
       int selection = input.nextInt();
       return selection;
	
	   }
	   
   
   //run the student menu
   private void runStudentMenu()
   {
       int option = studentMenu();
           switch (option)
           {
              case 1:    addStudent();
           	             break;
              case 2:    System.out.println(studentlist.listStudent());
                         break;
              case 3:    removeStudent();
              			 break;
              case 4:	 searchStudentID(); 
              			 break;
              case 5:	 searchStudentName();
              			 break;
              case 0:    runMainMenu();
              			 break;
             default:    System.out.println("Invalid option entered: " + option);
                         break;
           }
           
           System.out.println("\nPress any key to continue...");
           input.nextLine();  
           //display the menu again
           runStudentMenu();
       }
   
   private int roomMenu()
   { 
       System.out.println("room Menu");
       System.out.println("---------");    
       System.out.println("  1) add room");        
       System.out.println("  2) list rooms ");      
       System.out.println("  3) delete room");  
       System.out.println("  4) Search room by ID");
       System.out.println("  5) Search room by minimum number of beds");
       System.out.println("---------");         
       System.out.println("  0) main menu");
       System.out.print("==>> ");
       int selection = input.nextInt();
       return selection;
	
	   }
	   
   
   //run the room menu
   private void runRoomMenu()
   {
       int option = roomMenu();
           switch (option)
           {
              case 1:    addRoom();
           	             break;
              case 2:    System.out.println(roomlist.listRooms());
                         break;
              case 3:    removeRoom();
              			 break;
              case 4:    searchRoomID();
   			 			 break;
              case 5:    searchRoomMinBeds();
   			 			 break;
              case 0:    runMainMenu();
              			 break;
             default:    System.out.println("Invalid option entered: " + option);
                         break;
           }
           
           System.out.println("\nPress any key to continue...");
           input.nextLine();  
           //display the menu again
           runRoomMenu();
       }

      
   	private void addStudent()
   	{  
   		// set student doesn't have car as default
   		boolean hascar = false;
   		//generate an ID
   		String id = createID();
  		input.nextLine();
  		//take in the students name
   		System.out.print("Enter Student Name: ");
   		String name = input.nextLine().toLowerCase();
   		//take in the students gender
   		System.out.print("Enter Gender: ");
   		String gender = input.nextLine().toLowerCase();
   		//take in if student has a car, if not Y or N automatically set to false
   		System.out.print("Student has car y/n: ");
   		String car = input.nextLine();
   		if(car.equals("Y") || car.equals("y")) 
   			{
   				hascar = true;
   			}
   		else if (car.equals("N")||car.equals("n"))
   		{
   			hascar=false;
   		}
   		else 
   		{
   			System.out.println("invalid entry");
   		}
   		
   		System.out.print("Press Enter to Confirm");
   	
   		//create a student with these attributes
   		Student newstudent = new Student(name, gender, hascar, id);
   		//add that student to student list
   		studentlist.addStudent(newstudent);
   	}
   	
   	//wont remove head or tail
   	private void removeStudent() 
   	{
   		//set selection to head
   		StudentNode chosen = studentlist.getHead();
   		//list students
   		System.out.println(studentlist.listStudent());
   		System.out.println("Select ID of student to remove: ");
   		input.nextLine();
   		//read in ID from user
   		String id = input.nextLine();
   			//while i is less than the length of the student list
   			for(int i =1;i <= studentlist.countStudents(); i++)
   			{
   				//check if id entered is equal to the student ID
   				if (id.equals(chosen.getStudent().getStudentID()))
   				{
   					//if it is remove that student
   					studentlist.removeStudent(chosen);
   				}
   				//otherwise make chosen the next link and check again
   				chosen=chosen.getNext();		
   			}	
   	}
   	
   	private void searchStudentID() 
   	{
   		//set selection to head
   		StudentNode chosen = studentlist.getHead();
   		System.out.println("Enter ID to search for: ");
   		input.nextLine();
   		//read in ID from user
   		String id = input.nextLine();
   			//while i is less than or equal to the length of the student list
   		if (chosen != null)
		{
   			for(int i =1;i <= studentlist.countStudents(); i++)
   			{
   				//check if ID entered is equal to the student ID
   				if (id.equals(chosen.getStudent().getStudentID()))
   				{
   					//if it is display that student
   					System.out.println("id: " + chosen.getStudent().getStudentID()+
   										", name: "+ chosen.getStudent().getName()+
   										", has car: " + chosen.getStudent().getCar()+
   										", gender: " + chosen.getStudent().getGender());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no students available");
   		}
   	}
   	
   	private void searchStudentName() 
   	{
   		//set selection to head
   		StudentNode chosen = studentlist.getHead();
   		System.out.println("Enter name to search for: ");
   		input.nextLine();
   		//read in name from user
   		String name = input.nextLine().toLowerCase();
   			//while i is less than or equal to the length of the student list
   		if (chosen != null)
		{
   			for(int i =1;i <= studentlist.countStudents(); i++)
   			{
   				//check if name entered is equal to the student name
   				if (name.equals(chosen.getStudent().getName()))
   				{
   					//if it is display that student
   					System.out.println("id: " + chosen.getStudent().getStudentID()+
   										", name: "+ chosen.getStudent().getName()+
   										", has car: " + chosen.getStudent().getCar()+
   										", gender: " + chosen.getStudent().getGender());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no students available");
   		}
   	}
   	   	
   	
   	private void addProperty()
   	{  
   		//generate id
   		String id = createID();
  		input.nextLine();
  		//take address from user
   		System.out.print("Enter Address: ");
   		String address = input.nextLine().toLowerCase();
   		//take distance from user
   		System.out.print("Enter Distance from WIT: ");
   		double distance = input.nextDouble();
   		//take parking spaces
   		System.out.print("Number of Parking Spaces: ");
   		int spaces = input.nextInt();
   		//take number of rooms
   		System.out.print("Number of Rooms: ");
   		int rooms = input.nextInt();
   		
   		System.out.print("Press Enter to Confirm");
   	
   		//create new property with these attributes
   		Property newproperty = new Property(address, distance, spaces, rooms, id);
   		//add the new property to property list
   		propertylist.addProperty(newproperty);
   	}

   	private void removeProperty() 
   	{
   		//set selection to head
   		PropertyNode chosen = propertylist.getHead();
   		//list properties
   		System.out.println(propertylist.listProperty());
   		System.out.println("Select ID of property to remove: ");
   		input.nextLine();
   		//read in ID from user
   		String id = input.nextLine();
   			//while i is less than the length of the property list
   			for(int i =1;i <= propertylist.countProperties(); i++)
   			{
   				//check if id entered is equal to the property ID
   				if (id.equals(chosen.getProperty().getPropertyID()))
   				{
   					//if it is remove that property
   					propertylist.removeProperty(chosen);
   				}
   				//otherwise make chosen the next link and check again
   				chosen=chosen.getNext();		
   			}	
   	}
	
	private void searchPropertyID() 
   	{
   		//set selection to head
   		PropertyNode chosen = propertylist.getHead();
   		System.out.println("Enter ID to search for: ");
   		input.nextLine();
   		//read in ID from user
   		String id = input.nextLine();
   			//while i is less than or equal to the length of the property list
   		if (chosen != null)
		{
   			for(int i =1;i <= propertylist.countProperties(); i++)
   			{
   				//check if ID entered is equal to the property ID
   				if (id.equals(chosen.getProperty().getPropertyID()))
   				{
   					//if it is display that property
   					System.out.println(" Property ID: " + chosen.getProperty().getPropertyID() +
   							", Address: " + chosen.getProperty().getAddress() + 
   							", Distance: " + chosen.getProperty().getDistancekm() +
   							", Number of Rooms: " + chosen.getProperty().getNoRooms() +
   							", Number of Parking Spaces: " + chosen.getProperty().getParkingSpaces());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no properties available");
   		}
   	}
   	
	private void searchPropertyAddress() 
   	{
   		//set selection to head
   		PropertyNode chosen = propertylist.getHead();
   		System.out.println("Enter address to search for: ");
   		input.nextLine();
   		//read in address from user
   		String address = input.nextLine().toLowerCase();
   			//while i is less than or equal to the length of the property list
   		if (chosen != null)
		{
   			for(int i =1;i <= propertylist.countProperties(); i++)
   			{
   				//check if address entered is equal to the list address
   				if (address.equals(chosen.getProperty().getAddress()))
   				{
   					//if it is display that property
   					System.out.println(" Property ID: " + chosen.getProperty().getPropertyID() +
   							", Address: " + chosen.getProperty().getAddress() + 
   							", Distance: " + chosen.getProperty().getDistancekm() +
   							", Number of Rooms: " + chosen.getProperty().getNoRooms() +
   							", Number of Parking Spaces: " + chosen.getProperty().getParkingSpaces());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no properties available");
   		}
   	}
	
	private void searchPropertyMinSpaces() 
   	{
   		//set selection to head
   		PropertyNode chosen = propertylist.getHead();
   		System.out.println("Enter minimum number of parking spaces: ");
   		input.nextLine();
   		//read in number of spaces from user
   		int minimum = input.nextInt();
   			//while i is less than or equal to the length of the property list
   		if (chosen != null)
		{
   			for(int i =1;i <= propertylist.countProperties(); i++)
   			{
   				//check if the property has equal to or more than the minimum number of spaces
   				if (minimum <= chosen.getProperty().getParkingSpaces())
   				{
   					//if it is display that room
   					System.out.println("Property ID: " + chosen.getProperty().getPropertyID() +
							", Address: " + chosen.getProperty().getAddress() + 
							", Distance: " + chosen.getProperty().getDistancekm() +
							", Number of Rooms: " + chosen.getProperty().getNoRooms() +
							", Number of Parking Spaces: " + chosen.getProperty().getParkingSpaces());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no properties available");
   		}
   	}
	
	private void searchPropertyMinRooms() 
   	{
   		//set selection to head
   		PropertyNode chosen = propertylist.getHead();
   		System.out.println("Enter minimum number of rooms: ");
   		input.nextLine();
   		//read in number of rooms from user
   		int minimum = input.nextInt();
   			//while i is less than or equal to the length of the property list
   		if (chosen != null)
		{
   			for(int i =1;i <= propertylist.countProperties(); i++)
   			{
   				//check if the property has equal to or more than the minimum number of rooms
   				if (minimum <= chosen.getProperty().getNoRooms())
   				{
   					//if it is display that room
   					System.out.println("Property ID: " + chosen.getProperty().getPropertyID() +
							", Address: " + chosen.getProperty().getAddress() + 
							", Distance: " + chosen.getProperty().getDistancekm() +
							", Number of Rooms: " + chosen.getProperty().getNoRooms() +
							", Number of Parking Spaces: " + chosen.getProperty().getParkingSpaces());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no properties available");
   		}
   	}
   
	private void searchPropertyMaxDistance() 
   	{
   		//set selection to head
   		PropertyNode chosen = propertylist.getHead();
   		System.out.println("Enter maximum distance (km): ");
   		input.nextLine();
   		//read in number of rooms from user
   		double maximum = input.nextDouble();
   			//while i is less than or equal to the length of the property list
   		if (chosen != null)
		{
   			for(int i =1;i <= propertylist.countProperties(); i++)
   			{
   				//check if the property is less than the max distance
   				if (maximum >= chosen.getProperty().getDistancekm())
   				{
   					//if it is display that room
   					System.out.println("Property ID: " + chosen.getProperty().getPropertyID() +
							", Address: " + chosen.getProperty().getAddress() + 
							", Distance: " + chosen.getProperty().getDistancekm() +
							", Number of Rooms: " + chosen.getProperty().getNoRooms() +
							", Number of Parking Spaces: " + chosen.getProperty().getParkingSpaces());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no properties available");
   		}
   	}
	private void addRoom()
   	{  
		// generate id
   		String id = createID();
   		//ensuite is false by default
   		boolean ensuite = false;
  		input.nextLine();
  		//read in floor room is on
   		System.out.print("Enter floor: ");
   		int floor  = input.nextInt();
   		//read in if room is ensuite
   		System.out.print("is room ensuite y/n: ");
   		input.nextLine();
   		String isEnsuite = input.nextLine();
   		
   		if(isEnsuite.equals("Y") || isEnsuite.equals("y")) 
   			{
   				ensuite = true;
   			}
   		else if (isEnsuite.equals("N")||isEnsuite.equals("n"))
   			{
   				ensuite=false;
   			}
   		else 
   			{
   				System.out.println("invalid entry");
   			}
   		//read in number of beds
   		System.out.print("Number of beds: ");
   		int beds = input.nextInt();
   		
   		System.out.print("Press Enter to Confirm");
   	
   		// create a new room with these attributes
   		Room newroom = new Room(floor, ensuite, id, beds);
   		//add it to room list
   		roomlist.addRoom(newroom);
   	}
   	
   	private void removeRoom() 
   	{
   		//set selection to head
   		RoomNode chosen = roomlist.getHead();
   		//list rooms
   		System.out.println(roomlist.listRooms());
   		System.out.println("Select ID of room to remove: ");
   		input.nextLine();
   		//read in ID from user
   		String id = input.nextLine();
   			//while i is less than the length of the room list
   			for(int i =1;i <= roomlist.countRooms(); i++)
   			{
   				//check if id entered is equal to the room ID
   				if (id.equals(chosen.getRoom().getRoomID()))
   				{
   					//if it is remove that room
   					roomlist.removeRoom(chosen);
   				}
   				//otherwise make chosen the next link and check again
   				chosen=chosen.getNext();		
   			}	
   	}
   	
   	private void searchRoomID() 
   	{
   		//set selection to head
   		RoomNode chosen = roomlist.getHead();
   		System.out.println("Enter ID to search for: ");
   		input.nextLine();
   		//read in ID from user
   		String id = input.nextLine();
   			//while i is less than or equal to the length of the room list
   		if (chosen != null)
		{
   			for(int i =1;i <= roomlist.countRooms(); i++)
   			{
   				//check if ID entered is equal to the room ID
   				if (id.equals(chosen.getRoom().getRoomID()))
   				{
   					//if it is display that room
   					System.out.println(" room ID: " + chosen.getRoom().getRoomID() +
   							", Floor: " + chosen.getRoom().getFloor() + 
   							", Ensuite: " + chosen.getRoom().isEnsuite() +
   							", number of beds: " + chosen.getRoom().getBeds());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no rooms available");
   		}
   	}
   	
	private void searchRoomMinBeds() 
   	{
   		//set selection to head
   		RoomNode chosen = roomlist.getHead();
   		System.out.println("Enter minimum number of beds: ");
   		input.nextLine();
   		//read in number of beds from user
   		int minimum = input.nextInt();
   			//while i is less than or equal to the length of the room list
   		if (chosen != null)
		{
   			for(int i =1;i <= roomlist.countRooms(); i++)
   			{
   				//check if the room has equal to or more than the minimum number of beds
   				if (minimum <= chosen.getRoom().getBeds())
   				{
   					//if it is display that room
   					System.out.println(" room ID: " + chosen.getRoom().getRoomID() +
   							", Floor: " + chosen.getRoom().getFloor() + 
   							", Ensuite: " + chosen.getRoom().isEnsuite() +
   							", number of beds: " + chosen.getRoom().getBeds());
    			}
   			
   					//otherwise make chosen the next link and check again
   					chosen=chosen.getNext();			
   			}
		}
   		else
   		{
   			System.out.println("no rooms available");
   		}
   	}

   	//id generator from stack overflow https://stackoverflow.com/questions/1389736/how-do-i-create-a-unique-id-in-java
   	private static long idCounter = 0;

   	public static synchronized String createID()
   	{
   	    return String.valueOf(idCounter++);
   	}
   	
   	private void loadStudents()
   	{
   		input = new Scanner(System.in);
   		//create file from student file
        File sfile = new File(studentfile);
        //try catch incase file doesnt exist
        try 
        {
        	//use scanner to read file
			studentread = new Scanner(sfile);
			//while there is still next item in the file
			while (studentread.hasNext())
			{
				//create a string called data that = value from file
				String data = studentread.next();
				//create string array of data separated at comma
				String [] parts = data.split(",");
				//set name to the string at the 0 column
				String name = parts[0];
				//set gender to string at 1 column
				String gender = parts[1];
				boolean car = false;
				// set id to string at column 3
				String id = parts[3];
				//if column 2 is true set car to true, else its false
				if(parts[2].equals("true"))
				{
					 car = true;
				} 
				//create student using these  attributes from the file
				Student student = new Student(name,gender,car,id);
				//add the students
				studentlist.addStudent(student);
			}
			System.out.println("students loaded...");
			//close the read
			studentread.close();
		} catch (FileNotFoundException e) 
        {
			e.printStackTrace();
		}
   	}
   	
   	private void loadProperties()
   	{
   		input = new Scanner(System.in);
   		//create file from property file
        File pfile = new File(propertyfile);
        //try catch incase file doesnt exist
        try 
        {
        	//scanner reads in file
			propertyread = new Scanner(pfile);
			//while file still has data
			while (propertyread.hasNext())
			{
				//create a string using the data
				String data = propertyread.next();
				//create an array using the data separated at the comma
				String [] parts = data.split(",");
				//set address to data data in column 0
				String address = parts[0];
				// convert string at column 1 to double for distance
				double distance = Double.parseDouble(parts[1]);
				//convert string in column 2 to int for parking spaces
				int parking = Integer.parseInt(parts[2]);
				//convert string in column 3 to int for rooms
				int rooms = Integer.parseInt(parts[3]);
				//set id to column 4
				String id = parts[4];
				
				//create a new property using the values
				Property property = new Property(address, distance,parking,rooms,id);
				//add to the list
				propertylist.addProperty(property);
			
			}
			System.out.println("properties loaded...");
			//close the read
			propertyread.close();
		} catch (FileNotFoundException e) 
        {
			e.printStackTrace();
		}
   	}
   	
   	private void loadRooms()
   	{
   		input = new Scanner(System.in);
        File rfile = new File(roomfile);
        try 
        {
			roomread = new Scanner(rfile);
			while (roomread.hasNext())
			{
				String data = roomread.next();
				String [] parts = data.split(",");
				int floor = Integer.parseInt(parts[0]);
				boolean ensuite = false;
				if(parts[1].equals("true"))
				{
					 ensuite = true;
				} 
				String id = parts[2];
				int beds = Integer.parseInt(parts[3]);
				
				
				
				Room room = new Room(floor,ensuite,id,beds);
				roomlist.addRoom(room);
			
			}
			System.out.println("rooms loaded...");
			roomread.close();
		} catch (FileNotFoundException e) 
        {
			e.printStackTrace();
		}
   	}
}
