��package src.T_2015_02_09;

import java.util.Arrays;

/********************************************************
 * @author Eyal Levi ���� ���� ������ - ���������� �����
 *         https://github.com/LeviEyal
 ********************************************************/

public class BalloonContainer {
    final static int INIT_SIZE = 3;
    Balloon[] arr;
    int pointer, size;

    public BalloonContainer() {
        arr = new Balloon[INIT_SIZE];
        pointer = 0;
        size = 0;
    }

    public BalloonContainer(BalloonContainer o) {
        arr = new Balloon[INIT_SIZE];
        pointer = 0;
        size = 0;
        forint i = 0; i < arr.length; i++) {
            add(new Balloon(o.arr[i]));
        }
    }

    public void add(Balloon b) {
        ifpointer >= size)
            resize();
        arr[pointer++] = new Balloon(b);
    }

    private void resize() {
        size += INIT_SIZE;
        Balloon[] t = new Balloon[size];
        forint i = 0; i < arr.length; i++) {
            t[i] = arr[i];
        }
        arr = t;
    }

    public void removeSmallest() {
        forint i = 0; i < pointer; i++) {
            ifarr[i].getRadius() <= 1)
                remove(i);
        }
    }

    private void remove(int index) {
        ifindex > 0 && index < pointer) {
            size--;
            pointer--;
            Balloon[] t = new Balloon[size];
            int i = 0, k = 0;
            whilei < arr.length) {
                if (i != index)
                    t[k++] = arr[i];
                i++;
            }
            arr = t;
        }
    }

    @Override
    public String toString() {
        return "BalloonContainer: " + Arrays.toString(arr) + ", pointer=" + pointer + ", size=" + size;
    }

    
