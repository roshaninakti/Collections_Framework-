import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
            l.add(20);
            l.add("Hrutik");
            l.add("Roshani");
            l.add(25.4);
            l.add(true);
            l.add('A');
            l.add(null);
            System.out.println(l);

            System.out.println(l.size());

            l.remove(2);
            System.out.println(l);

            System.out.println(l.get(1));

            l.set(1, "Ros");
            System.out.println(l);


            //Using Contains()
           System.out.println( l.contains("Ros"));

        // isEmpty()
        System.out.println(l.isEmpty());
            

            
         
            
            }
        
            
}