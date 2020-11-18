package src.T_2019_07_18;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q3 {

    public static void main(String[] args) {
        Student s1 = new Student("Eyal", 1234567);
        Course c1 = new Course(1, "Infi", 6);
        Course c2 = new Course(2, "Java", 5);
        Course c3 = new Course(3, "Logics", 5);
        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.addCourse(c3);
        for (int i = 0; i < s1.getCoursesSigned(); i++) {
            System.out.println(s1.getCourses()[i].toString());
        }

        s1.setGrade(80, 1);
        s1.setGrade(90, 2);
        s1.setGrade(87, 3);
        for (int i = 0; i < s1.getCoursesSigned(); i++) {
            System.out.println(s1.getCourses()[i].toString());
        }
    }
}