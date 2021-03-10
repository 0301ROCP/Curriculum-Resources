package HouseTour;
​
public class House {
​
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontHouse fh = new FrontHouse();
		fh.greeting();
		fh.options();
		String option1 = fh.options();
		decision1(option1);
		
		
		Room kitchen = new Room("Kitchen", null, null,null,null);
		Room livingRoom = new Room("Livin Room",null,null,kitchen,null);
		kitchen.setBackRoom(livingRoom);
		
		Room bathroom = new Room("Bathroom",null,livingRoom,null,null);
		livingRoom.setLeftRoom(bathroom);
		
		/*
		 * String direction = sc.nextLing();
		 * 
		 * Room currentRoom =startingRoom
		 * 
		 * if(direction == "right"){
		 * 	currentRoom = currentRoom.getRightRoom();
		 * 
		 */
		
		
		System.out.println(option1);
	}
	
	static void decision1(String option1) {
		if(option1.contentEquals("1")) {
			LivingRoom lr = new LivingRoom();
			lr.greeting();
			String option2 = lr.option2();
//			return option2;
			
		} else if(option1.contentEquals("2")) {
			
			System.out.println("Okay bye son");
			
		} else {
			System.out.println("Please make a valid decision");
			
		}
	}
}
