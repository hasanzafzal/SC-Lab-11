public class VideoGame extends Item
{
    private String platform;
    public VideoGame(String title, int playingTime, String platform)
    {
        super(title, playingTime);
        this.platform = platform;
    }

    @Override
    public void print()
    {
        System.out.println("Video Game: " + getTitle() + " - " + platform);
        super.print();
    }
}
