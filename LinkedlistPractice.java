import java.util.Collections;
import java.util.LinkedList;
public class LinkedlistPractice {
    public static void main(String[] args) {
        LinkedList l =new LinkedList();
        l.add("rosh");
        l.add("John");
        l.add("sanu");
        l.add("Suhu");
        l.add("Durv");
    //    Adding element in linkedlist using addAll()
        LinkedList ll = new LinkedList ();
        ll.addAll(l);
        System.out.println(ll);
       
        // ll.removeAll(l);
        // System.out.println(ll);
   // Collectons.sort(collecton)
   System.out.println("Before element sorting" + ll);
   Collections.sort(ll);
   System.out.println("After element sorting" +ll);

   Collections.shuffle(ll);
   System.out.println("Element Shuffle" + ll);

   Collections.sort(ll,Collections.reverseOrder());
   System.out.println(ll);






    }
    
}
