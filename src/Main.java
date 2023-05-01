import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("aaa", "bba", "yyy", "abc", "takashi");

        List<String> sortedResult = names.stream().sorted().toList();

        long count = names.stream().filter(name -> name.endsWith("a")).count();

        boolean hasA = names.stream().map(String::toUpperCase).anyMatch(name -> name.contains("A"));

        System.out.println(sortedResult);

        System.out.println(count);

        System.out.println(hasA);

    }
}