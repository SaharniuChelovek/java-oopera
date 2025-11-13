package TheShow;


import Personality.Director;
import Personality.Person;



public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public String toString() {
        return "Opera{" +
                "choirSize=" + choirSize +
                ", musicAuthor=" + musicAuthor +
                ", librettoText='" + librettoText + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActor=" + listOfActor +
                '}';
    }
}
