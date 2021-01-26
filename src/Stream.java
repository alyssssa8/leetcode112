import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5,2,4);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);

        // create a list of String
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,5,3,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);
        System.out.println("________");
        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));
        System.out.println("________");
        // demonstration of reduce method
        int even =  number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);

        List<String> arr1
                = new ArrayList<String>();
        arr1.add("2");
        arr1.add("1");
        arr1.add("3");
        arr1.add("6");
        arr1.add("4");
        arr1.add("0");
        arr1
                .parallelStream()
                .forEach(
                        s -> {
                            System.out.print(s);
                        });
    }
}
