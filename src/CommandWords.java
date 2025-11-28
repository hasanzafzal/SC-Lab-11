public class CommandWords
{
    private String[] validCommands = {"go", "help", "quit"};

    public boolean isCommand(String word)
    {
        for (String cmd : validCommands)
        {
            if (cmd.equals(word)) return true;
        }
        return false;
    }

    public String getCommandList()
    {
        return String.join(" ", validCommands);
    }
}