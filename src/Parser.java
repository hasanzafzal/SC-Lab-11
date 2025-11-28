import java.util.Scanner;

public class Parser
{
    private CommandWords commands = new CommandWords();
    private Scanner reader = new Scanner(System.in);

    public Command getCommand()
    {
        System.out.print("> ");
        String[] words = reader.nextLine().split(" ");

        String word1 = words.length > 0 ? words[0] : null;
        String word2 = words.length > 1 ? words[1] : null;

        return new Command(commands.isCommand(word1) ? word1 : null, word2);
    }

    public void showCommands()
    {
        System.out.println("Commands: " + commands.getCommandList());
    }
}