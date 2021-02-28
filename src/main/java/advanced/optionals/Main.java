package advanced.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String stringVariable = "ceapa";
        String stringNull = null;

        Optional<String> optionalStringEmpty = Optional.empty();
        Optional<String> optionalStringNull = Optional.ofNullable(stringNull);
        Optional<String> optionalString1 = Optional.of(stringVariable);

        System.out.println(optionalStringEmpty.isPresent());

        if (optionalString1.isPresent()) {
            System.out.println(optionalString1.get());
        }

        if (optionalStringNull.isPresent()) {
            System.out.println(optionalStringNull.get());
        }else {
            System.out.println(optionalStringNull.orElse("Default"));
        }
    }
}
