public class Main {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student("John Doe", "123", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Update view initially
        controller.updateView();

        // Update the student details through the controller
        controller.setStudentName("Jane Doe");
        controller.setStudentId("456");
        controller.setStudentGrade("B");

        // Update view again
        controller.updateView();
    }
}
