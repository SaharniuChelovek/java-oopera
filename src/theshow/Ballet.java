package theshow;


import personality.Director;
import personality.Person;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    @Override
    public String toString() {
        return "Ballet{" +
                "choreographer=" + choreographer +
                ", musicAuthor=" + musicAuthor.toString() +
                ", librettoText='" + librettoText + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActor=" + listOfActor +
                '}';
    }
}
