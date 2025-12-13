import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актер{ " +
                "Фамилия: " + getSurname() +
                " Имя: " + getName() +
                " (Рост: " + height +
                " см.)}";
    }

    /*
        Функция сравнения при добавлении актеров
        -1 - если ошибка
        1 - если такой человек есть
        0 - если такого нет
     */
    public int equal(Object o) {
        if (this == o) return 1;
        if (o == null || getClass() != o.getClass()) return -1;
        Actor actor = (Actor) o;
        if(height == actor.height && Objects.equals(getName(), actor.getName()) && Objects.equals(getSurname(), actor.getSurname())) {
            return 1;
        }
        return 0;
    }

    public void replaceActor(Actor actor) {

    }
}
