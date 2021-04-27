public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "Engin Demirog", "Free", 30);
        Course course2 = new Course(
                "Programlamaya Giriş için Temel Kurs", "Engin Demirog", "Free", 100);
        Course course3 = new Course(
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "Engin Demirog", "Free", 0);
        Course[] courses = {course1, course2, course3};

        CourseManager courseManager = new CourseManager();

        for (Course course : courses) {
            System.out.println("Course: " + course.courseName);
            System.out.println("Instructor: " + course.instructor);
            System.out.println("Course Type: " + course.courseType);
            System.out.println("Completion Rate: " + course.completionRate);
            System.out.println("-----------------------");
        }


        for (Course aboutCourse : courses) {
            courseManager.CourseRegistration(aboutCourse);
            courseManager.CourseCompletion(aboutCourse);
            System.out.println("-----------------------");
        }

    }
}
