package task1;

public class App {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иван", 33, Subjects.MATHEMATICS);
        Teacher teacher2 = new Teacher("Любовь", 35, Subjects.LOGICS);
        Teacher teacher3 = new Teacher("Татьяна", 40, Subjects.PHYSICS);

        Learner learner1 = new Learner("Петр", 10, Subjects.MATHEMATICS, 0);
        Learner learner2 = new Learner("Катя", 10, Subjects.MATHEMATICS, 1);
        Learner learner3 = new Learner("Федр", 10, Subjects.LOGICS, 2);
        Learner learner4 = new Learner("Лена", 10, Subjects.MATHEMATICS, 0);
        Learner learner5 = new Learner("Света", 10, Subjects.PHYSICS, 0);

        Director director = new Director("Валентина", 50);

        System.out.println(learner1.toString());

        School school = new School("Школа №1", director, new Teacher[]{teacher1, teacher2, teacher3}, new Learner[]{learner1, learner2, learner3, learner4, learner5});
        school.dayAtSchool();

        System.out.println(learner1.toString());

    }
}
