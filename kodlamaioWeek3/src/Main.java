public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Nedim");
        user.setSurname("Can");
        user.setEmail("test@mail.com");
        user.setPassword("testpassw");
        user.setId(1);

        Student student = new Student();
        student.setTakenCourseByStudent("Java Camp");

        Instructor instructor = new Instructor();
        instructor.setName("Engin");
        instructor.setSurname(" Demirog");
        instructor.setLecturer(instructor.getName() + instructor.getSurname());

        UserManager userManager = new UserManager();
        userManager.registerToCourse(user, student);
        userManager.deregisterFromCourse(user, student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.assignHomework(user, instructor);
        instructorManager.sharePost(user, instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.sendHomework(user);
        studentManager.wasAttended(user);

    }
}
