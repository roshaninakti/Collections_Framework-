import java.util.LinkedHashSet;

public class Linked_Hashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhasset = new LinkedHashSet<Integer>();
        lhasset.add(10);
        lhasset.add(20);
        lhasset.add(30);
        lhasset.add(40);
        lhasset.add(50);
        System.out.println(lhasset);

        // remove()
    lhasset.remove(40);
    System.out.println(lhasset);

    // contains()
    System.out.println(lhasset.contains(10));
    // isEmpty()
    System.out.println(lhasset.isEmpty());

    }
}
