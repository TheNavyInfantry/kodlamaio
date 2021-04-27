public class CourseManager {
    public void CourseRegistration(Course course) {
        System.out.println("You enrolled for the " + course.courseName);
    }

    public void CourseCompletion(Course course) {
        if (course.completionRate == 100){
            System.out.println("You have completed " + course.courseName + " course!");
        }

        else {
            System.out.println("For this " + course.courseName + " course, you need to keep studying!");
        }
    }
}
