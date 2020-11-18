package src.T_2018_07_08;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class LocalTime {
    private String city;
    private int rat;
    private Clock clk;

    public LocalTime(String n, int r, Clock c) {
        city = n;
        if(r<=12 && r>= -12)
            rat = r;
        else rat = 0;
        clk = new Clock(c);
    }
    public LocalTime(LocalTime other) {
        city = other.getCity();
        rat = other.getRat();
        clk = new Clock(other.getClk()); 
    }
    public String toString() {
        String c = rat<0? "":"+";
        return ""+city+" time: "+clk+" "+c+""+rat+" UTC";
    }
    public boolean equals(LocalTime other){
        boolean a = this.city.equals(other.getCity());
        boolean b = this.rat==other.getRat();
        boolean c = this.clk.getHours()==other.clk.getHours();
        boolean d = this.clk.getMinutes()==other.clk.getMinutes();
        return a && b && c && d;
    }
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public int getRat() {return rat;}
    public void setRat(int rat) {this.rat = rat;}
    public Clock getClk() {return clk;}
    public void setClk(Clock clk) {this.clk = clk;}
}