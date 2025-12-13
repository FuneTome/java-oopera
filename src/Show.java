import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;
    protected String typeOfShow = "обычного";

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printActors(){
        if(listOfActors.size() == 0){
            System.out.println("В данном представлении пока что нет актеров!");
            return;
        }
        System.out.println("\nАктеры " + typeOfShow + " спектакля:");
        for(Actor actor : listOfActors){
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor){
        if(listOfActors.size() == 0){
            listOfActors.add(actor);
            System.out.println("Актер успешно добавлен!");
            return;
        }
        for(Actor act : listOfActors){
            if(actor.equal(act) == -1){
                System.out.println("Неправильный формат данных или нулевая ссылка!");
                return;
            } else if(actor.equal(act) == 1){
                System.out.println("Такой актер уже существует!");
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println("Актер успешно добавлен!");
    }

    public void replaceActor(Actor actor, String surname){
        if(listOfActors.size() == 0){
            System.out.println("В данном представлении пока что нет актеров!");
            return;
        }
        for(Actor act : listOfActors){
            if(surname.equals(act.getSurname())){
                listOfActors.remove(act);
                listOfActors.add(actor);
                System.out.println("\nАктер успешно заменен!");
                return;
            }
        }
        System.out.println("\nАктера с такой фамилией найти не удалось!");
    }
}
