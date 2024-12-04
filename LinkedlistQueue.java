import java.util.LinkedList;
public class LinkedlistQueue {
public static void main(String[] args) {
       LinkedList lu = new LinkedList() ;
       lu.add("Rosh");
       lu.add(100);
       lu.add('A');
       lu.add(true);
       lu.add(14.8);
       lu.offer("Hrush");
       System.out.println(lu);
       System.out.println(lu.element());
       System.out.println(lu.peek());
       // Return and  remove element from  head 
       // using 2 method remove() and poll()
       lu.remove();
       System.out.println(lu);
       lu.poll();
       System.out.println(lu);


}
          
}