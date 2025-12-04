public class CD extends Item
{
    private String artist;
    private int tracks;
    public CD(String title, String artist, int tracks, int playingTime)
    {
        super(title, playingTime);
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void print()
    {
        System.out.println("CD: " + getTitle() + " - " + artist + ", Tracks: " + tracks);
        super.print();
    }
}
