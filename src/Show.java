import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;
    protected String typeOfShow = "обычного";

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printActors(){
        if(listOfActors.isEmpty()){
            System.out.println("В данном представлении пока что нет актеров!");
            return;
        }
        System.out.println("\nАктеры " + typeOfShow + " спектакля:");
        for(Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    public void printDirector(){
        System.out.println("Режисером спектакля " + title +  " является: " + director);
    }

    public void addActor(Actor actor){
        if(listOfActors.isEmpty()){
            listOfActors.add(actor);
            System.out.println("Актер успешно добавлен!");
            return;
        }
        for(Actor act : listOfActors){
            if(actor.equals(act)) {
                System.out.println("Такой актер уже существует!");
                return;
            }
        }
        listOfActors.add(actor);
        System.out.println("Актер успешно добавлен!");
    }

    public void replaceActor(Actor actor, String surname){
        if(listOfActors.isEmpty()){
            System.out.println("В данном представлении пока что нет актеров!");
            return;
        }
        boolean found = false;
        for(int i = 0; i < listOfActors.size(); i++){
            Actor act = listOfActors.get(i);
            if(surname.equals(act.getSurname())){
                listOfActors.set(i, actor);
                System.out.println("\nАктер успешно заменен!");
                found = true;
            }
        }
        if(!found){
            System.out.println("\nАктера с такой фамилией найти не удалось!");
        }
    }
}
