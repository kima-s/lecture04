import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("aaa", "bba", "yyy", "abc", "takashi");

        names.stream().sorted().forEach(System.out::println);

        long count = names.stream().filter(name -> name.endsWith("a")).count();

        boolean hasA = names.stream().map(String::toUpperCase).anyMatch(name -> name.contains("A"));

        System.out.println(count);

        System.out.println(hasA);

    }
}