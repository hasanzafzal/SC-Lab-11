import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();

    public Room(String description)
    {
        this.description = description;
    }

    public void setExit(String direction, Room room)
    {
        exits.put(direction, room);
    }

    public Room getExit(String direction)
    {
        return exits.get(direction);
    }

    public String getLongDescription()
    {
        return "You are " + description + ".\nExits: " + String.join(" ", exits.keySet());
    }
}
