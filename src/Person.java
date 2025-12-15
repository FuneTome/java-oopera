public class Person {
    public String name;
    public String surname;
    private Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", Фамилия: " + surname;
    }
}
