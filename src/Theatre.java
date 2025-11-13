import Personality.Actor;
import Personality.Director;
import Personality.Gender;
import Personality.Person;
import TheShow.Ballet;
import TheShow.Opera;
import TheShow.Show;

import java.util.logging.LoggingPermission;


public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Стив", "Верстаков", Gender.MALE, 180);
        Actor actor2 = new Actor("Коннор", "Лоуренс", Gender.MALE, 200);
        Actor actor3 = new Actor("Ангелина", "Морозова", Gender.FEMALE, 175);
        Director director1 = new Director("Энакин", "Скайуокер", Gender.MALE, 28);
        Director director2 = new Director("Екатерина", "Вторая", Gender.FEMALE, 127);
        Person choreographer = new Person("Владимир", "Тройноесальто", Gender.FEMALE);
        Person musicMaster = new Person("Пианист", "Балалайков", Gender.MALE);
        Opera drama = new Opera("Дождь из клинков", 240, director1, musicMaster, "Искры соприкасающихся металлических клинков летели во все стороны, озаряя непроглядную тьму своим ярким светом, что быстро исчезал, не просуществовав и секунды.", 456);
        Show greatestShow = new Show("", 120, director2);
        Ballet ballet = new Ballet("Озерные лебеди", 45, director2, musicMaster, "лебедь озеро фонарь", choreographer);
        ballet.addActor(actor2);
        drama.addActor(actor2);
        greatestShow.addActor(actor3);
        drama.addActor(actor3);
        greatestShow.addActor(actor1);
        ballet.addActor(actor1);

        ballet.printListOfActors();

        drama.printListOfActors();
        drama.removeActor(actor2);
        drama.addActor(actor1);
        drama.printListOfActors();



        greatestShow.removeActor(actor1);
        greatestShow.printListOfActors();
        greatestShow.removeActor(actor2);
        greatestShow.printListOfActors();

        System.out.println(drama.getLibrettoText());
        System.out.println(ballet.getLibrettoText());


    }
}
//Возможно я слегка наворотил лишнего. Данных много и я на автомате везде прописывал геттеры и методы toString
//по ощущениям в некоторых местах они лишние. Прошу прощения.
