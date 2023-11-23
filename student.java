
public class student extends person{
    private Classroom classroom;
    public Classroom getClassroom() {
        return classroom;
    }
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
    public student(boolean parent_permission, int age, String name, int id) {
        super(age, name, parent_permission, id);
    }
}
