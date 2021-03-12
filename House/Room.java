public class Room {

    private String name;
    private Room left;
    private Room right;
    private Room forwards;
    private Room backward;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getLeft() {
        return left;
    }

    public void setLeft(Room left) {
        this.left = left;
    }

    public Room getRight() {
        return right;
    }

    public void setRight(Room right) {
        this.right = right;
    }

    public Room getForwards() {
        return forwards;
    }

    public void setForwards(Room forwards) {
        this.forwards = forwards;
    }

    public Room getBackward() {
        return backward;
    }

    public void setBackward(Room backward) {
        this.backward = backward;
    }

}
