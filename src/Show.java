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
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor.getFullName() + " добавлен в спектакль");
        } else {
            System.out.println("Ошибка: Актёр " + actor.getFullName() + " уже есть в списке");
        }
    }

    public void replaceActor(Actor oldActor, String newActorSurname) {
        int index = listOfActors.indexOf(oldActor);
        if (index != -1) {
            Actor newActor = findActorBySurname(newActorSurname);
            if (newActor != null) {
                listOfActors.set(index, newActor);
                System.out.println("Актёр " + oldActor.getFullName() +
                        " заменён на " + newActor.getFullName());
            } else {
                System.out.println("Ошибка: Актёр с фамилией " + newActorSurname + " не найден");
            }
        } else {
            System.out.println("Ошибка: Актёр " + oldActor.getFullName() + " не найден в спектакле");
        }
    }

    private Actor findActorBySurname(String surname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                return actor;
            }
        }
        return null;
    }

    public void printActorsList() {
        System.out.println("Список актёров спектакля '" + title + "':");
        if (listOfActors.isEmpty()) {
            System.out.println("В спектакле пока нет актёров");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("- " + actor);
            }
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