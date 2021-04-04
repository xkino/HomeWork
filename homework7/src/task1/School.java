package task1;

public class School {
    private String name;
    private Director director;
    private Teacher [] teachers;
    private Learner [] learners;

    public School(String name, Director director, Teacher[] teachers, Learner[] learners) {
        this.name = name;
        this.director = director;
        this.teachers = teachers;
        this.learners = learners;
    }

    public void dayAtSchool(){
     director.startOfClasses();
        for (int i = 0; i < teachers.length; i++) {
            for (int j = 0; j < learners.length; j++) {
                if(!teachers[i].getSubjectTaught().equals(learners[j].getSubjectUnderStudy())) continue;
                teachers[i].learn(learners[j]);
            }
        }
     director.stopOfClasses();
    }

}
