package src.T_2015_07_21;

import java.util.Arrays;

/********************************************************
 * @author Eyal Levi ÿÿÿÿ ÿÿÿÿ ÿÿÿÿÿÿ - ÿÿÿÿÿÿÿÿÿÿ ÿÿÿÿÿ
 *         https://github.com/LeviEyal
 ********************************************************/

public class RingCollection {

    final static int DEFAULT_SIZE = 3;
    Ring[] rings;
    int pointer, size;

    public RingCollection() {
        rings = new Ring[DEFAULT_SIZE];
        pointer = 0;
        size = 0;
    }

    public RingCollection(RingCollection o) {
        rings = new Ring[DEFAULT_SIZE];
        pointer = 0;
        size = 0;
        for (int i = 0; i < rings.length; i++) {
            addDifferent(new Ring(o.rings[i]));
        }
    }

    public int contains(Ring t) {
        for (int i = 0; i < pointer; i++)
            if (rings[i].equals(t))
                return i;
        return -1;
    }

    public void addDifferent(Ring t) {
        if (contains(t) == -1) {
            if (pointer >= size)
                resize();
            rings[pointer++] = t;
        }
    }

    private void resize() {
        size += DEFAULT_SIZE;
        Ring[] t = new Ring[size];
        for (int i = 0; i < rings.length; i++) {
            t[i] = rings[i];
        }
        rings = t;
    }

    public void remove(int index) {
        if (index > 0 && index < pointer) {
            size --;
            pointer--;
            Ring[] t = new Ring[size];
            int i = 0, k=0;
            while (i < rings.length) {
                if (i != index)
                    t[k++] = rings[i];
                i++;
            }
            rings = t;
        }
    }

    @Override
    public String toString() {
        return "RingCollection [pointer=" + pointer + ", rings=" + Arrays.toString(rings) + ", size=" + size + "]";
    }

    
    
}