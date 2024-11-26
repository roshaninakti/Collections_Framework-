import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayListProc {
    public static void main(String[] args) {
    
        ArrayList a1 = new ArrayList();
        a1.add("Hrutik");
        a1.add("Roshani");
        a1.add("Shrihan");
        a1.add("Shriyali");
        a1.add("Rudrashi");

        // Using addAll Method 
        ArrayList arra1 = new ArrayList();
        arra1.addAll(a1);
        System.out.println(arra1);

        //Using removeAll Method
        arra1.removeAll(a1);
        System.out.println(arra1);

    //   Using sort method
        System.out.println("Elements in the array list " + a1);
        Collections.sort(a1);
        System.out.println(("Elements in the  array list after " + a1));

        Collections.sort(a1, Collections.reverseOrder());
        System.out.println("Elements in the array list reverseOrder " + a1 );

        //  Using Shuffer method

        Collections.shuffle(a1);
        System.out.println("Elements in the aaray list shuffle "+ a1);






        


    }
    
}
