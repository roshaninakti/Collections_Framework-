import java.util.HashSet;
public class Hash_set1 {
    public static void main(String[] args) {
        HashSet <String> familyMembers = new HashSet<String>();
        familyMembers.add("Rosh");
        familyMembers.add("Hrush");
        familyMembers.add("Suhu");
        familyMembers.add("Darv");
        System.out.println(familyMembers);

        // addAll()
        HashSet <String> friendsCircle = new HashSet<String>();
        friendsCircle.addAll(familyMembers);
        friendsCircle.add("Riz");
        System.out.println(friendsCircle);

        // remoeAll
        friendsCircle.removeAll(familyMembers);
        System.out.println(friendsCircle);








        
    }
    
}
