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

    public void changeActor(Actor newActor, String oldLastname) {
        int index = -1;
        int count = 0;
        for (int i = 0; i < listOfActor.size(); i++) {
            Actor actor = listOfActor.get(i);
            if (actor.getLastName().equals(oldLastname)) {
                index = i;
                count +=1;
            }
        }
        switch (count) {
            case 0:
                System.out.println("Ошибка: актер с данной фамилией не найден.");
                break;
            case 1:
                listOfActor.set(index, newActor);
                System.out.println("Замена актера произведена успешно.");
                break;
            default:
                System.out.println("Ошибка: в списке несколько актеров с заданной фамилией.");
                break;
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
