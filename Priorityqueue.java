import java . util.PriorityQueue;
public class Priorityqueue {
  public static void main(String[] args) {
          PriorityQueue u = new PriorityQueue();
          u.add("A");
          u.add("B");
          u.add("C");
          u.offer("Cu");
          u.offer("Hrush");
          u.offer("Anu");
          System.out.println(u);
          System.out.println(u.element());
          System.out.println(u.peek());
          u.remove();
          System.out.println(u);
          u.poll();
          System.out.println(u);
  }
          
}