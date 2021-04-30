public class StudentManager extends UserManager {

    public void sendHomework(User user) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() + ", Your homework has successfully sent.");
    }

    public void wasAttended(User user) {
        System.out.println("Dear " + user.getName() + " " + user.getSurname() + ", You have successfully attended today's course.");
    }

}
