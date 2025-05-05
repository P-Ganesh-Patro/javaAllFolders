import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetString42 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new SortTreeSet1());
        ts.add("ganesh");
        ts.add("varma");
        ts.add("manoj");
        ts.add("eswar rao");
        ts.add("vamsi krishna");
        System.out.println(ts);

    }

}

class SortTreeSet1 implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s2.length(), s1.length());
    }
}

