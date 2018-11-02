import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class J {
    public static void main(String[] args) {
        System.out.println();
        List<String> list = Arrays.asList("b","c","a");
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);

        Function<String, Integer> stringToInteger =
                (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInteger2 =
                Integer::parseInt;

        Predicate<String> predicate = (String s) -> true;

    }
}
