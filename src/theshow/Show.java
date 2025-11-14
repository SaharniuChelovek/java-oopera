package theshow;


import personality.Actor;
import personality.Director;
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

    public void changeActor(Actor oldActor, Actor newActor) {
        if (listOfActor.contains(oldActor)) {
            if (listOfActor.contains(newActor)) {
                System.out.println("Такой актер уже есть в списке.");
            } else {
                int index = returnIndex(oldActor);
                listOfActor.set(index, newActor);
                System.out.println("замена актера произведена успешно.");
            }
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

    public int returnIndex(Actor actor) {
        int index = listOfActor.indexOf(actor);
        return index;

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
