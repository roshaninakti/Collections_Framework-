import java.util.LinkedList;

public class LinkedListPractice1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Rosh");
        l.add("hrush");
        l.add("sanu");
        l.add("suhu");
        l.add("Durv");
        System.out.println(l);
        l.addFirst("Shri");
        l.addLast("Shriyali");
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
    }
}
