import java.util.HashSet;
public class Hash_set {
    public static void main(String[] args) {
        // HashSet hs = new HashSet(100); // initial capacity 
        // HashSet hs = new HashSet(100,(float) 0.75);
        // HashSet<Integer> hs = new HashSet<Integer>();// homofenous elements 
        HashSet hs = new HashSet();//Declare hashset class default capacity 16 and load factor is 0.75
        // Add objects in hashset
        hs.add(100);
        hs.add(true);
        hs.add(57.9);
        hs.add("Rosh");
        hs.add('A');
        hs.add(null);
        System.out.println(hs);

        // remove()
        hs.remove("Rosh");
        System.out.println(hs);

        // Contains()
       System.out.println(hs.contains('A'));
       // isEmpty()
       System.out.println(hs.isEmpty());

    }
    
}
