package advanced.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> counties = new ArrayList<>();
        counties.add("Iasi");
        counties.add("Suceava");
        counties.add("Vaslui");
        counties.add("Galati");


        System.out.println(counties);
        counties.remove("Vaslui");
        System.out.println("\nIndex of Iasi is: " + counties.indexOf("Iasi"));

        System.out.println("");

        for (int i = 0; i < counties.size(); i++) {
            System.out.print(counties.get(i) + ' ');
        }

        System.out.println("\n"); //Show list with foreach

        for (String element : counties) {
            System.out.print(element + ' ');
        }

        System.out.println("\n"); //Show list with foreach condensed

        counties.forEach(System.out::println);

        System.out.println(""); //Show list with iterator

        Iterator<String> iterator = counties.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ' ');
        }

    }
}
