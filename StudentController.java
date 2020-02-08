public class StudentController {
    private Student model;
    private StudentView view;

    /**
     * @param model
     * @param view
     */
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    /**
     * @param name
     */
    public void setStudentName(String name){
        model.setName(name);
    }

    /**
     * @return
     */
    public String getStudentName(){
        return model.getName();
    }

    /**
     * @param rollNo
     */
    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    /**
     * @return
     */
    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}

