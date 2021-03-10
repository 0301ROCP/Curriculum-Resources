package HouseTour;
​
public class Room {
	
  private String roomName;
  
  private Room leftRoom;
  private Room rightRoom;
  private Room forwardRoom;
  private Room backRoom;
  
  
  
public Room(String roomName, Room leftRoom, Room rightRoom, Room forwardRoom, Room backRoom) {
	super();
	this.roomName = roomName;
	this.leftRoom = leftRoom;
	this.rightRoom = rightRoom;
	this.forwardRoom = forwardRoom;
	this.backRoom = backRoom;
}
​
​
public String getRoomName() {
	return roomName;
}
public void setRoomName(String roomName) {
	this.roomName = roomName;
}
public Room getLeftRoom() {
	return leftRoom;
}
public void setLeftRoom(Room leftRoom) {
	this.leftRoom = leftRoom;
}
public Room getRightRoom() {
	return rightRoom;
}
public void setRightRoom(Room rightRoom) {
	this.rightRoom = rightRoom;
}
public Room getForwardRoom() {
	return forwardRoom;
}
public void setForwardRoom(Room forwardRoom) {
	this.forwardRoom = forwardRoom;
}
public Room getBackRoom() {
	return backRoom;
}
public void setBackRoom(Room backRoom) {
	this.backRoom = backRoom;
}
  
  
}