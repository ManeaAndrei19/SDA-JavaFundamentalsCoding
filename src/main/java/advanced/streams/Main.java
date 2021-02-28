package advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrei", "Bogdan", "Catalina", "Delia", "Bell");
        Stream<String> nameStream = names.stream();

        /** Streams - findFirst, findAny, collect
         */

        List<String> namesCopy = names.stream().collect(Collectors.toList());
        System.out.println(namesCopy);

        Optional<String> firstName = names.stream().findFirst();
        if (firstName.isPresent()) {
            System.out.println(firstName.get());
        }

        /** Streams - filter , map
         */

        List<String> nameStartingWithB = names.stream()
                .filter(element -> element.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(nameStartingWithB);

        List<Integer> wordSizes = names.parallelStream()
                .filter(element -> element.endsWith("a"))
                .map(String::length).collect(Collectors.toList());
        System.out.println(wordSizes);

        names.stream().forEach(element -> System.out.print(element + ' '));

        /**Streams - allMatch and anyMatch
         */

        boolean allNamesLengthIsGreaterThan3=names.stream()
                .allMatch(n->n.length()>3);

        boolean thereIsaNameWichLengthIsGreaterThan7=names.stream()
                .anyMatch(n->n.length()>7);

        if (allNamesLengthIsGreaterThan3){
            System.out.println("All names are greater than 3 characters");
        }

        if (thereIsaNameWichLengthIsGreaterThan7){
            System.out.println("At least 1 name is greater than 7");
        }

    }
}
