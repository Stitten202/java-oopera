public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", автор музыки: " + musicAuthor +
                ", размер хора: " + choirSize + " человек";
    }
}
