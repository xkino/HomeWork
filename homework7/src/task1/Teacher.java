package task1;

public class Teacher extends Person implements Learn {
    private String subjectTaught;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        subjectTaught = subject;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    @Override
    public void learn(Learner learner) {
        System.out.println(name + " учит " + learner.name);
        learner.study();
    }
}
