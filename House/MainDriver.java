import java.util.Scanner;

public class MainDriver {

    public static void main(String[] args) {

        Room livingRoom = new Room("Living Room", null, null, null);
        Room kitchen = new Room("Kitchen", livingRoom, null, null, null);
        livingRoom.setRight(kitchen);

        Room bathroom = new Room("Bathroom", null, livingRoom, null, null);
        livingRoom.setLeft(bathroom);

        Room currentRoom = livingRoom;

        String direction = "Right";

        /*
         * if(direction == "right") currentRoom = currentRoom.right;
         */
    }
}
