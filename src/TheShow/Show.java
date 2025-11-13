package TheShow;

import Personality.Actor;
import Personality.Director;
import Personality.Person;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActor;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActor = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActor() {
        return listOfActor;
    }

    public void addActor(Actor actor) {
        if (listOfActor.contains(actor)) {
            System.out.println("Такой актер уже есть в списке");

        } else {

            listOfActor.add(actor);
            System.out.println("Актер успешно добавлен в список.");
        }
    }

    public void removeActor(Actor hActor) {
        if (listOfActor.contains(hActor)) {
            listOfActor.remove(hActor);
            System.out.println("Актер удален из списка.");
        } else {
            System.out.println("Такого актера в списке нет.");
        }
    }

    public void printListOfActors() {
        System.out.println("Список актеров:");
        for (Actor iActor : listOfActor) {
            System.out.println(iActor);
        }
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActor=" + listOfActor +
                '}';
    }
}
