package src.T_2019_02_03;

/********************************************************
*  @author Eyal Levi
*  ���� ���� ������ - ���������� ����� 
*  https://github.com/LeviEyal
********************************************************/

public class Compressed {
    int value;
    int length;

    public Compressed(int value, int length) {
        this.value = value;
        this.length = length;
    }

    public Compressed(Compressed other) {
        this.value = other.value;
        this.length = other.length;
    }

    public String toString() {
        return "(" + value + "," + length + ")";
    }
}