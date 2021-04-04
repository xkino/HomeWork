package task1;

public class Learner extends Person implements Study {

    private String subjectUnderStudy;
    private int knowledgeLevel;

    public Learner(String name, int age, String subject, int level) {
        super(name, age);
        subjectUnderStudy = subject;
        knowledgeLevel = level;
    }

    public String getSubjectUnderStudy() {
        return subjectUnderStudy;
    }

    @Override
    public void study() {
        knowledgeLevel++;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "subjectUnderStudy='" + subjectUnderStudy + '\'' +
                ", knowledgeLevel=" + knowledgeLevel +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
