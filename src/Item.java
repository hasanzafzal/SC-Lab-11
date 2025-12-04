public class Item
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    public Item(String title, int playingTime)
    {
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = false;
        this.comment = "";
    }
    public String getTitle()
    {
        return title;
    }
    public int getPlayingTime()
    {
        return playingTime;
    }
    public boolean getOwn()
    {
        return gotIt;
    }
    public void setOwn(boolean own)
    {
        this.gotIt = own;
    }
    public void setComment(String comment)
    {
        this.comment = comment;
    }
    public String getComment()
    {
        return comment;
    }
    public void print()
    {
        System.out.println(title + " (" + playingTime + " mins)");
        if (gotIt) System.out.println("Owned");
        if (!comment.isEmpty()) System.out.println("Comment: " + comment);
    }
}