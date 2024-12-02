import java.util.HashSet;
public class Hash_set2 {
    public static void main(String[] args) {
        HashSet<String> familyMembers = new HashSet<String>();
        familyMembers.add("Rosh");
        familyMembers.add("Hrush");
        familyMembers.add("Shri");
        familyMembers.add("Shriyu");
        familyMembers.add("Rudrz");
        System.out.println("FamilyMembers is " + familyMembers);

        HashSet<String> friendCircle = new HashSet<String>();
        friendCircle.add("Rosh");
        friendCircle.add("Hrush");
        friendCircle.add("Suhu");
        friendCircle.add("Sanu");
        friendCircle.add("Durv");
        System.out.println("FriendCircle is "+ friendCircle);

        // Union
        familyMembers.addAll(friendCircle);
        System.out.println(" Union "+familyMembers);

        // Insersection
        // familyMembers.retainAll(friendCircle);
        // System.out.println(" Intersection "+familyMembers);

        // differece
        familyMembers.removeAll(friendCircle);
        System.out.println(" differece "+familyMembers);

        




    }
}
