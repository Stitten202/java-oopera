public class MusicalShow extends Show {
    public String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля '" + getTitle() + "':");
        System.out.println(librettoText);
        System.out.println();
    }

    public String getTitle() {
        return super.toString().split(": ")[1].split(",")[0];
    }
}