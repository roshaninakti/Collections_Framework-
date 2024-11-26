import java.util.ArrayList;
public class ArrayListPra {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(100);
        a1.add("Hrutik");
        a1.add("Roshani");
        a1.add('A');
        a1.add(25.5);
        System.out.println(a1);
        System.out.println("Number of element in arraylist " + a1.size());
         a1.remove(3);
         System.out.println("Remove element from"+a1);
         System.out.println(a1.get(1));
         a1.set(0,"Khanloskar");
         System.out.println(a1);
         System.out.println(a1.contains("Hrutik"));   
         System.out.println(a1.isEmpty());     

    }
}