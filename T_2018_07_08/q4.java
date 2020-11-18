package src.T_2018_07_08;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q4 {
    public static void main(String[] args) {
        LocalTime lt1 = new LocalTime("London", 7 ,new Clock(3, 5));
        LocalTime lt2 = new LocalTime("London", -7 ,new Clock(3, 5));
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt1.equals(lt2));
    }
    
}