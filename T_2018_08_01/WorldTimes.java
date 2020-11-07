package src.T_2018_08_01;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class WorldTimes {

    private int numOfClocks;
    private Clock clockArray[];
    private static int numOfObjects=0;

    public WorldTimes(int n){
        this.numOfClocks=n;
        this.clockArray = new Clock[n];
        for(int i=0; i<n; i++)
            clockArray[i] = new Clock(i,0);
        numOfObjects++;
    }
    public WorldTimes(WorldTimes otherWT){
        this.clockArray = new Clock[otherWT.getNumOfClocks()];
        this.numOfClocks = otherWT.getNumOfClocks();
        for(int i=0; i<this.numOfClocks; i++)
            this.clockArray[i] = new Clock(otherWT.getTimeIndex(i));
        numOfObjects++;
    }
    public Clock getTimeIndex(int i){
        if(i<0 || i>this.numOfClocks) return null;
        return this.clockArray[i];
    }
    public void addOne(){
        for(int i=0; i<this.numOfClocks; i++){
            this.clockArray[i].setHours(this.clockArray[i].getHours()+1);
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

