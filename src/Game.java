public class Game
{
    private Parser parser;
    private Room currentRoom;

    public Game()
    {
        createRooms();
        parser = new Parser();
    }

    private void createRooms()
    {
        Room outside = new Room("outside the house");
        Room hall = new Room("in the hallway");
        Room kitchen = new Room("in the kitchen");
        outside.setExit("east", hall);
        hall.setExit("west", outside);
        hall.setExit("south", kitchen);
        kitchen.setExit("north", hall);

        currentRoom = outside;
    }

    public void play()
    {
        System.out.println("Welcome to Zuul!");
        System.out.println("Type 'help' to see commands.");
        System.out.println(currentRoom.getLongDescription());

        boolean finished = false;
        while (!finished)
        {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }

        System.out.println("Thanks for playing. Goodbye!");
    }

    private boolean processCommand(Command command)
    {
        if (command.isUnknown())
        {
            System.out.println("I don't understand that...");
            return false;
        }

        String commandWord = command.getCommandWord();

        switch (commandWord)
        {
            case "help":
                printHelp();
                break;
            case "go":
                goRoom(command);
                break;
            case "quit":
              return true;
            default:
                System.out.println("Unknown command.");
                break;
        }
        return false;
    }

    private void printHelp()
    {
        System.out.println("You are in a game. Use commands to navigate.");
        parser.showCommands();
    }

    private void goRoom(Command command)
    {
        if (!command.hasSecondWord())
        {
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null)
        {
            System.out.println("You can't go that way!");
        }
        else
        {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }

    public static void main(String[] args)
    {
        new Game().play();
    }
}