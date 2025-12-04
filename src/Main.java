import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Database db = new Database();
        Scanner sc = new Scanner(System.in);

        db.add(new CD("Coke Studio season 9", "Strings", 27, 78));
        db.add(new CD("Coke Studio season 12", "Rohail Hyatt", 14, 42));
        db.add(new Video("Wicked: For Good", "Universal Pictures", 148));
        db.add(new VideoGame("GTA V", 60, "PC"));
        System.out.println("Initial Items Loaded.\n");

        while (true)
        {
            System.out.println("==== Menu ====");
            System.out.println("1. Add CD");
            System.out.println("2. Add Video");
            System.out.println("3. Add Video Game");
            System.out.println("4. List all items");
            System.out.println("5. Search by title");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice;
            try
            {
                choice = Integer.parseInt(sc.nextLine());
            }
            catch (Exception e)
            {
                System.out.println("Invalid input.");
                continue;
            }
            if (choice == 1)
            {
                System.out.print("Enter CD title: ");
                String title = sc.nextLine();
                System.out.print("Enter artist: ");
                String artist = sc.nextLine();
                System.out.print("Enter number of tracks: ");
                int tracks = Integer.parseInt(sc.nextLine());
                System.out.print("Enter playing time: ");
                int time = Integer.parseInt(sc.nextLine());
                db.add(new CD(title, artist, tracks, time));
                System.out.println("CD added.\n");

            }
            else if (choice == 2)
            {
                System.out.print("Enter video title: ");
                String title = sc.nextLine();
                System.out.print("Enter director: ");
                String director = sc.nextLine();
                System.out.print("Enter playing time: ");
                int time = Integer.parseInt(sc.nextLine());
                db.add(new Video(title, director, time));
                System.out.println("Video added.\n");

            }
            else if (choice == 3)
            {
                System.out.print("Enter game title: ");
                String title = sc.nextLine();
                System.out.print("Enter playing time: ");
                int time = Integer.parseInt(sc.nextLine());
                System.out.print("Enter platform: ");
                String platform = sc.nextLine();
                db.add(new VideoGame(title, time, platform));
                System.out.println("Video game added.\n");

            }
            else if (choice == 4)
            {
                System.out.println("\n=== Database Contents ===");
                db.list();

            }
            else if (choice == 5)
            {
                System.out.print("Enter title to search: ");
                String title = sc.nextLine();
                db.searchTitle(title);

            }
            else if (choice == 6)
            {
                System.out.println("Exiting...");
                break;

            }
            else
            {
                System.out.println("Invalid option.\n");
            }
        }
    }
}