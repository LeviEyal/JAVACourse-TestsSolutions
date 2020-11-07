package src.T_2007_Sample;

/********************************************************
*  @author Eyal Levi
*  ���� ���� ������ - ���������� ����� 
*  https://github.com/LeviEyal
********************************************************/

public interface Drawable{
    public void setColor(int c);

    public boolean equals(Drawable d);

    public int getColor();

    public boolean contaisns(Point p);

    public double perimeter();

    public double area();

    public void translate(Point p);
}