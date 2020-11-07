package src.T_2015_02_09;

/********************************************************
*  @author Eyal Levi
*  ���� ���� ������ - ���������� ����� 
*  https://github.com/LeviEyal
********************************************************/

public class Balloon {
    private double x;
    private double y;
    private double z;
    private double radius;

    public Balloon(double x, double y, double z, double radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }
    public Balloon(Balloon other){
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
        this.radius = other.radius;
    }
    public double volume(){
        return 4/3.0 * Math.PI * radius*radius*radius;
    }
    public boolean isIn(double x, double y, double z){
        double distance = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
        return (distance<=radius);
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
}