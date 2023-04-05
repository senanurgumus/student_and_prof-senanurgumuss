package tr.edu.maltepe.oop;
public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Ensar Gul");
        Student student1 = new Student("Ada");
        Student student2 = new Student("Selin");

        prof.teach(student1);
        student1.takeNotes();

        prof.teach(student2);
        student2.takeNotes();
    }
}
