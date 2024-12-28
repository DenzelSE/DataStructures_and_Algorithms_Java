import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Frontend");
        set.add("Backend");
        set.add("fullstack");
        set.add("null");

        System.out.println(set);

        //removing 
        set.remove("null");
        System.out.println("after removing null: "+ set);

        //contains
        System.out.println("is backend in?"+ set.contains("Backend"));

        //size
        System.out.println("size of the set: "+ set.size());

        //clearing

        set.clear();
        System.out.println("after clearing: "+ set);
    }
}
