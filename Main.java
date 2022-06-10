import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("1","2","3","4","11","16");
        Integer result = stream.mapToInt(Integer::parseInt).filter((x) -> (x > 10)).sum();
        System.out.println(result);

    }
}
