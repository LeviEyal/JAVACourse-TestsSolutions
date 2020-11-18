package src.T_2015_02_09;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class BalloonContainer {
    private Balloon[] bArray;
    private int size;

    public BalloonContainer(){
        this.size = 3;
        this.bArray = new Balloon[this.size];

    }
    public void add(Balloon b){
        for(int i=0; i<bArray.length; i++)
            if(bArray[i] == null){
                bArray[i] = new Balloon(b);
            }
    }
}