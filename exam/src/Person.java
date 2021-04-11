import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public void setAge(int age) {
        if (age < 14){
            throw new IllegalArgumentException("Полных лет не может быть меньше 14.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
//                ", DateOfBirth=" + age +
                '}';
    }
}

