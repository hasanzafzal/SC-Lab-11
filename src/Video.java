public class Video extends Item
{
    private String director;
    public Video(String title, String director, int playingTime)
    {
        super(title, playingTime);
        this.director = director;
    }

    @Override
    public void print()
    {
        System.out.println("Video: " + getTitle() + " - " + director);
        super.print();
    }
}
