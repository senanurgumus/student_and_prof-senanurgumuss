package tr.edu.maltepe.oop;
public class Student {
    private String name;
    private Professor professor;

    public Student(String name) {
        this.name = name;
    }

    public void listen(Professor professor) {
        System.out.println(this.name + " is listening to " + professor.getName() + ".");
        this.professor = professor;
    }

    public void takeNotes() {
        System.out.println(this.name + " is taking notes from " + this.professor.getName() + ".");
    }
}
