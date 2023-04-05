package tr.edu.maltepe.oop;
public class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void teach(Student student) {
        System.out.println(this.name + " is teaching.");
        student.listen(this);
    }

    public String getName() {
        return this.name;
    }
}

