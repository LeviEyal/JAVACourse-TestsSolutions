package src.T_2019_07_18;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Course {
    private int number;
    private String name;
    private int naz;
    private int grade;

    public Course(int number, String name, int naz) {
        this.number = number;
        this.name = name;
        this.naz = naz;
    }

    public Course(Course other) {
        this(other.number, other.name, other.naz);
    }

    public int getNumber() {
        return number;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    

    //------------------------------------------
        /* Added only for testing */
    public String toString(){
        return "Course NO.: "+number+"\tName: "
        +name+"\tPoints: "+naz+"\tGrade: "+grade;
    }
    
    
    
    
}