package src.T_2019_07_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Student {

    private String name;
    private long id;
    private Course[] courses;
    private int numCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = new Course[10];
    }

    public boolean addCourse(Course c){
        if(numCourses >= 10) return false;
        courses[numCourses] = new Course(c);
        numCourses++;
        return true;
    }

    public boolean setGrade(int grade, int numCourse){
        if(grade<0 || grade>100) return false;
        for(int i=0; i<numCourses; i++){
            if(courses[i].getNumber() == numCourse){
                courses[i].setGrade(grade);
                return true;
            }
        }
        return false;
    }

    //-----------------------------------------
        /* Added only for testing */
    public Course[] getCourses() {
        return courses;
    }
    public int getCoursesSigned() {
        return numCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

}