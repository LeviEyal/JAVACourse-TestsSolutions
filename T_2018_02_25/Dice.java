package src.T_2018_02_25;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Dice {

    private int p;
    private int a[];

    public Dice(int n){
        this.p = n;
        this.a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = (int)(Math.random()*2*n)+1;
        }
    }
    public Dice(Dice other){
        this.p = other.p;
        this.a = new int[other.a.length];
        for(int i=0; i<other.a.length; i++){
            a[i] = other.a[i];
        }
    }
    public int throwt(){
        int r = (int)(Math.random()*this.p);
        return this.a[r];
    }
}