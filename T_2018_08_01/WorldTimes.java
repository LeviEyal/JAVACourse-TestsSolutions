package src.T_2018_08_01;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class WorldTimes {

    private int numOfClocks;
    private Clock clockArray[];
    private static int numOfObjects=0;

    public WorldTimes(int n){
        numOfClocks=n;
        clockArray = new Clock[n];
        for(int i=0; i<n; i++)
            clockArray[i] = new Clock(i,0);
        numOfObjects++;
    }
    public WorldTimes(WorldTimes otherWT){
        clockArray = new Clock[otherWT.getNumOfClocks()];
        numOfClocks = otherWT.getNumOfClocks();
        for(int i=0; i<numOfClocks; i++)
            clockArray[i] = new Clock(otherWT.getTimeIndex(i));
        numOfObjects++;
    }
    public Clock getTimeIndex(int i){
        if(i<0 || i>numOfClocks) return null;
        return clockArray[i];
    }
    public void addOne(){
        for(int i=0; i<numOfClocks; i++){
            clockArray[i].setHours(clockArray[i].getHours()+1);
        }
    }
    public static int getNumOfObjects(){
        return numOfObjects;
    }
    public int getNumOfClocks() {
        return numOfClocks;
    }
    public Clock[] getClockArray() {
        return clockArray;
    }
}

