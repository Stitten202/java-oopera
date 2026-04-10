import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration; // в минутах
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        listOfActors.add(actor);
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актёр " + oldActor + " заменён на " + newActor);
        } else {
            System.out.println("Ошибка: Актёр " + oldActor + " не найден в спектакле");
        }
    }

    public void printActorsList() {
        System.out.println("Список актёров спектакля '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Спектакль: " + title +
                ", длительность: " + duration + " мин" +
                ", режиссёр: " + director;
    }
}