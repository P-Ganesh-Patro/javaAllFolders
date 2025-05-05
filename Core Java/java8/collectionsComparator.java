import java.util.Comparator;

public class collectionsComparator implements Comparator<student> {
    @Override
    public int compare(student s1, student s2) {
        return s1.std_name.compareTo(s2.std_name);
    }

    // @Override
    // public int compare(student o1, student o2) {
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'compare'");
    // }

}
