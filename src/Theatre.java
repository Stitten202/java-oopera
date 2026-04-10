public class Theatre {
    public static void main(String[] args) {
        //Создаём актёров и режиссёров
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 1.85);
        Actor actor2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 1.70);
        Actor actor3 = new Actor("Алексей", "Иванов", Gender.MALE, 1.78);

        Director director1 = new Director("Сергей", "Николаев", Gender.MALE, 15);
        Director director2 = new Director("Елена", "Козлова", Gender.FEMALE, 8);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Михаил Барышников";

        //Создаём спектакли
        Show regularShow = new Show("Гамлет", 180, director1);
        Opera operaShow = new Opera("Кармен", 210, director2, musicAuthor,
                "История о любви и страсти...", 40);
        Ballet balletShow = new Ballet("Лебединое озеро", 160, director1, musicAuthor,
                "Волшебная история о лебедях...", choreographer);

        //Распределяем актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        operaShow.addActor(actor2);
        operaShow.addActor(actor3);

        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        //Выводим списки актёров для каждого спектакля
        regularShow.printActorsList();
        operaShow.printActorsList();
        balletShow.printActorsList();

        //Заменяем актёра в одном из спектаклей
        Actor newActor = new Actor("Ольга", "Смирнова", Gender.FEMALE, 1.68);
        balletShow.replaceActor(actor3, newActor);
        balletShow.printActorsList();

        //Пытаемся заменить несуществующего актёра
        Actor nonExistentActor = new Actor("Неизвестный", "Актёр", Gender.MALE, 1.80);
        regularShow.replaceActor(nonExistentActor, actor1);

        //Выводим либретто для оперного и балетного спектакля
        operaShow.printLibretto();
        balletShow.printLibretto();
    }
}
