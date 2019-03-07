import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calcul {
    private int minim;
    private int maxim;
    private int numarProbleme;
    private List<Problema> list;

    public Calcul(int minim, int maxim, int numarProbleme) {
        this.minim = minim;
        this.maxim = maxim;
        this.numarProbleme = numarProbleme;
        this.list = new ArrayList<>();
    }

    public void formareLista() {
        ArrayList<Integer> listInteger = new ArrayList<Integer>();
        for (int i = minim; i <= 2 * maxim - minim+1; i++) {
            listInteger.add(new Integer(i));
        }
        Collections.shuffle(listInteger);
        for (int i = 0; i < numarProbleme; i++) {
            String s;
            if (listInteger.get(i) <= maxim) {
                s = "F";
                list.add(new Problema(listInteger.get(i), s));
            } else {
                s = "A";
                list.add(new Problema(listInteger.get(i) - maxim + minim, s));
            }
        }
    }

    public int getMinim() {
        return minim;
    }

    public void setMinim(int minim) {
        this.minim = minim;
    }

    public int getMaxim() {
        return maxim;
    }

    public void setMaxim(int maxim) {
        this.maxim = maxim;
    }

    public List<Problema> getList() {
        return list;
    }

    public void setList(List<Problema> list) {
        this.list = list;
    }
}
