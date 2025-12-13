public class Ballet extends MusicalShow {
    private String chorejgrapher;

    public Ballet(String title, int duration, Director director, String musicAuthor, String librettoText, String chorejgrapher) {
        super(title, duration, director, musicAuthor, librettoText);
        this.chorejgrapher = chorejgrapher;
        this.typeOfShow = "балетного";
    }

    @Override
    public void printActors() {
        super.printActors();
    }
}
