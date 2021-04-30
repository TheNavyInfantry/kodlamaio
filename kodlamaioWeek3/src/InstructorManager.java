public class InstructorManager extends UserManager {

    public void assignHomework(User user, Instructor instructor) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() + ", Your homework was given by " + instructor.getLecturer() + ".");
    }

    public void sharePost(User user, Instructor instructor) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() + ", " + instructor.getLecturer() + " has shared a new information post.");
    }


}
