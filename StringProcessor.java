import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StringProcessor {
    public static void processStrings(List<String> input,
                                      Predicate<String> filter,
                                      Function<String, String> transform,
                                      Consumer<String> action) {
        input.stream()
             .filter(filter)
             .map(transform)
             .forEach(action);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Моргалчлал", "Гаршил", "Сайн", "Үг");

        Predicate<String> longEnough = s -> s.length() > 5;
        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
        Consumer<String> print = s -> System.out.println("ГАРШИЛ: " + s.toUpperCase());

        processStrings(words, longEnough, reverse, print);
    }
}
