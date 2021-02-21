package advanced.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> notes = new HashSet<>();

        notes.add(10);
        notes.add(1);
        notes.add(6);
        notes.add(2);
        notes.add(8);
        notes.add(10);

        System.out.println(notes.toString());

        for (Integer element : notes
        ) {
            System.out.print(element + " ");

        }
    }
}
