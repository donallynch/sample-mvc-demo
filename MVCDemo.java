/**
 *
 */
public class MVCDemo {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /* Get student record */
        Student model = retriveStudentFromDatabase();

        /* Display student details */
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        /* Update model */
        controller.setStudentName("John");
        controller.updateView();
    }

    /**
     *
     * @return
     */
    private static Student retriveStudentFromDatabase(){

        /* Mock User coming from database */
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");

        return student;
    }
}

