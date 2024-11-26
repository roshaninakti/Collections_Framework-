import java.util.ArrayList;
import java.util.Arrays;
public class ArraylistPract {
    public static void main(String[] args) {
        String arr[] = {"Hrutik", "Roshani", "Rudrashi"};
        for(String Value:arr)
        System.out.println(Value);
        ArrayList a1 = new ArrayList(Arrays.asList(arr));
        System.out.println(a1);
    }
}