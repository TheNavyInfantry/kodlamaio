public class UserManager {

    public void registerToCourse(User user, Student student) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() +
                ", You have successfully registered to the " + student.getTakenCourseByStudent() + " course.");
    }

    public void deregisterFromCourse(User user, Student student) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() +
                ", You have deleted your registration from the " + student.getTakenCourseByStudent() + " course.");
    }
}
