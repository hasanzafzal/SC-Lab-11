import java.util.ArrayList;

public class Database
{
    private ArrayList<Item> items;
    public Database()
    {
        items = new ArrayList<>();
    }
    public void add(Item item)
    {
        items.add(item);
    }
    public void list()
    {
        for (Item item : items)
        {
            item.print();
            System.out.println();
        }
    }
    public void searchTitle(String title)
    {
        for (Item item : items)
        {
            if (item.getTitle().equalsIgnoreCase(title))
            {
                item.print();
                System.out.println();
            }
        }
    }
}
