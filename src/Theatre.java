public class Theatre {
    public static void main(String[] args) {
        Actor Vdovina = new Actor("Наталья", "Вдовина", Gender.FEMALE, 165);
        Actor Orlovski = new Actor("Николай", "Орловский", Gender.MALE, 175);
        Actor Butorin = new Actor("Юрий", "Буторин", Gender.MALE, 180);

        Director Mashkov = new Director("Владимир", "Машков", Gender.MALE, 12);
        Director Bogomolov = new Director("Константин", "Богомолов", Gender.MALE, 15);

        String chorejgrapher = "Юрий Николаевич Григорович";
        String musicAuthor = "Михаил Иванович Глинка";

        Show show = new Show("На бойком месте", 145, Mashkov);
        Opera opera = new Opera("Жизнь за царя", 111, Bogomolov, musicAuthor, "В 1613 году " +
                "Сусанин ценою жизни спас первого избранного русского царя", 5);
        Ballet ballet = new Ballet("Лебединое озеро", 180, Bogomolov, musicAuthor, "В основу " +
                "либретто легли сказки европейских народов и писателей о девушках и принцессах, превращённых злым \n" +
                "колдуном в белых лебедей. Днём эти девушки в виде лебедей плавают по озеру, образовавшемуся из слёз \n" +
                "матери одной похищенной девушки, а по ночам снова превращаются в людей. ", chorejgrapher);

        show.addActor(Vdovina);
        show.addActor(Orlovski);

        opera.addActor(Butorin);
        opera.addActor(Orlovski);

        ballet.addActor(Vdovina);
        ballet.addActor(Butorin);

        show.printDirector();
        opera.printDirector();
        ballet.printDirector();

        show.printActors();
        opera.printActors();
        ballet.printActors();

        show.replaceActor(Butorin, "Вдовина");
        show.printActors();

        ballet.replaceActor(Orlovski, "Шапокляк");

        ballet.printLibrettoText();
        opera.printLibrettoText();
    }
}
