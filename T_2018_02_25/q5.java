package src.T_2018_02_25;

public class q5 {
    public static void main(String[] args) {
        MyLinkedList t = new MyLinkedList();
        t.add(4);
        t.add(6);
        t.add(3);
        t.add(0);
        t.add(12);
        System.out.println(t);
        t.sort();
        System.out.println(t);

    }
}
